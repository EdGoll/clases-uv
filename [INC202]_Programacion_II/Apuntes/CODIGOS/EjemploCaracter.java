public int ejCaracterAleatoreo () {
	int rand_num = (int) (Math.random ()*(122 - 97))+97;
	System.out.println (" Letra : " + (char)rand_num );
	return rand_num ;
}