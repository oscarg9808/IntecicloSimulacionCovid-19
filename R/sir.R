library(deSolve)

N = 12000
init <- c(S = 11988, I=20, R=10)
param <- c(beta = 0.0002306, gamma = 0.334565)

sir <- function(times, init, param) {

  with(as.list(c(init, param)), {
    dS <- -beta * S * I
    dI <-  beta * S * I - gamma * I
    dR <-                 gamma * I

    return(list(c(dS, dI, dR)))
  })
}

r0 <-  0.0002306/0.334565
print("R0 es: ")
print(r0)

times <- seq(92, 110, by = 0.1)
out <- ode(y = init, times = times, func = sir, parms = param)
out <- as.data.frame(out*N)
out$time <- NULL


png("../images/Sir/sir.png",
    width=5000,height=3000,units="px",
    pointsize=12,bg="white",res=300)

matplot(x = times, y = out, type = "l",
        xlab = "Días", ylab = "Infectados", main = "Sir Covid-19 Italia ",
        lwd = 1, lty = 1, bty = "l", col = 2:4)


dev.off()




