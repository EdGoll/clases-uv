if (estado ==true)
	System.out.println("El estado es verdadero");
else {
	System.out.println("cambiando el estado...");
	if (aceptaCambio == 1)
		estado = true;
		System.out.println("Cambio el estado y ahora es verdadero");
	else System.out.println("No se acepto el cambio de estado");
}