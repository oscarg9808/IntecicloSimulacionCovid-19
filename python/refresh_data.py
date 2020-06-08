import pandas as pd;
#confirmados
url = 'https://raw.githubusercontent.com/CSSEGISandData/COVID-19/master/csse_covid_19_data/csse_covid_19_time_series/time_series_covid19_confirmed_global.csv'
df = pd.read_csv(url)
start_date = "1/31/20"
clasificador = df[df['Country/Region'] == "Italy"]
confirmados = clasificador.iloc[0].loc[start_date:]
confirmados.to_csv('../datos/confirmados.csv' ,header = False, index=False) 
#muertos
url = 'https://raw.githubusercontent.com/CSSEGISandData/COVID-19/master/csse_covid_19_data/csse_covid_19_time_series/time_series_covid19_deaths_global.csv'
df = pd.read_csv(url)
start_date = "1/31/20"
clasificador = df[df['Country/Region'] == "Italy"]
confirmados = clasificador.iloc[0].loc[start_date:]
confirmados.to_csv('../datos/fallecidos.csv' ,header = False, index=False) 
#recuperados
url = 'https://raw.githubusercontent.com/CSSEGISandData/COVID-19/master/csse_covid_19_data/csse_covid_19_time_series/time_series_covid19_recovered_global.csv'
df = pd.read_csv(url)
start_date = "1/31/20"
clasificador = df[df['Country/Region'] == "Italy"]
confirmados = clasificador.iloc[0].loc[start_date:]
confirmados.to_csv('../datos/recuperados.csv' ,header = False, index=False) 
