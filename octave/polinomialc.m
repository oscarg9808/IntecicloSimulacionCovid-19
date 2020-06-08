clear all;
clc;
datos = csvread('../datos/confirmados.csv'); 
y=datos(:,1);
x=1.0:1.0:length(y);
x = x';
n=6; %Grado del polinomio
p=polyfit(x,y,n-1);
z=@(xx) polyval(p,xx);
y_pred=zeros(length(y)+30,1);
x_pred = 1.0:1.0:length(y_pred);
x_pred = x_pred';
for c = length(y):length(y_pred)
      y_pred(c) = polyval(p,c); 
end 
fprintf('Población en el año 2000, %3.2f\n',polyval(p,length(x)+30))
p= polyfit(x,y,n)
xp=linspace (min( x ) ,max( x ) ,1000) ;
yp=polyval ( p , xp ) ;
y_pred = y_pred(length(y):length(y_pred),1);
x_pred = x_pred(length(y):length(x_pred),1);
figure1 = figure;
axes1 = axes('Parent',figure1);
hold(axes1,'all');
hold on
plot(x,y,'bo','markersize',3,'markerfacecolor','b')
plot ( xp , yp )
plot(x_pred,y_pred,'g+','markersize',3,'markerfacecolor','b')
xlabel('Dias')
ylabel('Infectados')
grid on
title('Modelo Polinomial de Infectados');
hold off
saveas(figure1,'../images/polinomial/polinomialc.jpg')  
set(figure1,'Visible','off');  
