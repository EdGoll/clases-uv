float 
	promedioCatedra = (notaCatedra1 + notaCatedra2) / 2, 
	promedioTareas = (notaTarea1 + notaTarea2) / 2,
	notaPresentacion;
if (promedioCatedra >= 4.0) {
	notaPresentacion = 
		promedioCatedra * 0.6 + 
		notaControl * 0.2 +
		promedioTareas * 0.2;
} else {
	notaPresentacion = 
		promedioCatedra * 0.8 + 
		notaControl * 0.1 +
		promedioTareas * 0.1;
}