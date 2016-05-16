//import java.awt.Font;

//import edu.princeton.cs.introcs.StdDraw;

//Grille[][] grille = new Grille[13][13];
//		for (int i=0; i<13; i++){
//			for (int j=0; j<13; j++){
//				System.out.print("coucou"+ grille[i][j].getCouleur());
//			}
//			System.out.println();
//		}
//		for (int i=1, j=0; j <100;i++, j++){
//			if (i==1)
//				System.out.println(i+ "(joueur 1)");
//			else if (i==2)
//				System.out.println(i+ "(joueur 2)  ");
//			else if (i==3)
//				System.out.println(i+ " (joueur 3)");
//			else {
//				System.out.println(i+ " (joueur 4)");
//				i=0;
//			}
//		StdDraw.setCanvasSize(1366, 768);
//		StdDraw.setXscale(0, 26);
//		StdDraw.setYscale(0, 13);
//		StdDraw.setPenRadius(0.01);
//		Font j = new Font("Bookman Old Style", 3, 70);
//		Font k = new Font("Bookman Old Style", 2, 40);
//		StdDraw.setFont(j);
//		StdDraw.picture(13, 7, "357653blanc.jpg");
//		StdDraw.setPenColor(StdDraw.WHITE);
//		double[] x = { 5.3, 20.5, 20, 5.8 };
//		double[] y = { 13, 13, 11.5, 11.5 };
//		StdDraw.filledPolygon(x, y);
//		StdDraw.setPenColor(StdDraw.BLACK);
//		StdDraw.polygon(x, y);
//		---------StdDraw.setPenColor(/*StdDraw.GREEN*/130,130,130);
//		StdDraw.text(13, 12, "Jeu des 6 couleurs");
//		StdDraw.setPenColor(StdDraw.BLUE);
//		//StdDraw.filledRectangle(13, 7, 4, 1);
//		StdDraw.picture(13, 7, "caseblanche.png", 8, 2);
//		StdDraw.setPenColor(/*StdDraw.GREEN*/130,130,130);
//		//StdDraw.filledRectangle(13, 4, 4, 1);
//		StdDraw.picture(13, 4, "caseblanche.png", 8, 2);
//		StdDraw.setPenColor(StdDraw.RED);
//		//StdDraw.filledRectangle(13, 1, 4, 1);
//		StdDraw.picture(13, 1, "caseblanche.png", 8, 2);
//		StdDraw.setPenColor(StdDraw.BLACK);
//		StdDraw.setFont(k);
//		StdDraw.rectangle(13, 7, 4, 1);
//		StdDraw.rectangle(13, 4, 4, 1);
//		StdDraw.rectangle(13, 1, 4, 1);
//		StdDraw.text(13, 7, "Jouer");
//		StdDraw.text(13, 4, "Connaitre les règles");
//		StdDraw.text(13, 1, "Quitter l'application");
//		boolean r = true;
//		int e =0;
//		int f =0;
//		int g =0;
//		int choix=4;
//		while (r == true && choix!=0 && choix!=1 && choix!=2){
//			
//			
//			if (StdDraw.mouseX()>=9 && StdDraw.mouseX()<=17 && StdDraw.mouseY()>=0 && StdDraw.mouseY()<=2){
//				if (e==0){
//					StdDraw.setPenColor(255, 150, 0);
//					----------StdDraw.filledRectangle(13, 1, 4, 1);
//					StdDraw.picture(13, 1, "casepickedblanche.png", 8, 2);
//					StdDraw.setPenColor(StdDraw.BLACK);
//					StdDraw.rectangle(13, 1, 4, 1);
//					StdDraw.text(13, 1, "Quitter l'application");
//					e=1;
//				}
//				else {
//					
//				}
//				if (StdDraw.mousePressed()){
//					r= false;
///					choix = 1;
//				}
///				else {
///					
///				}
///			}
///			else {
///				if (e==1){
///					StdDraw.setPenColor(StdDraw.RED);
///					---------StdDraw.filledRectangle(13, 1, 4, 1);
///					StdDraw.picture(13, 1, "caseblanche.png", 8, 2);
///					StdDraw.setPenColor(StdDraw.BLACK);
///					StdDraw.rectangle(13, 1, 4, 1);
///					StdDraw.text(13, 1, "Quitter l'application");
///					e=0;
///				}
///				else{
///					
///				}
///				
///			}
///			if (StdDraw.mouseX()>=9 && StdDraw.mouseX()<=17 && StdDraw.mouseY()>=3 && StdDraw.mouseY()<=5){
	///			if (f==0){
	//				StdDraw.setPenColor(StdDraw.YELLOW);
//					//StdDraw.filledRectangle(13, 4, 4, 1);
//					StdDraw.picture(13, 4, "casepickedblanche.png", 8, 2);
//					StdDraw.setPenColor(StdDraw.BLACK);
//					StdDraw.rectangle(13, 4, 4, 1);
//					StdDraw.text(13, 4, "Connaitre les règles");
//					f=1;
//				}
///				else {
//					
///				}
//				if (StdDraw.mousePressed()){
///					r= false;
///					choix = 2;
///				}
///				else {
///					
///				}
///			}
///			else {
///				if (f==1){
///					StdDraw.setPenColor(StdDraw.GREEN);
///					//StdDraw.filledRectangle(13, 4, 4, 1);
///					StdDraw.picture(13, 4, "caseblanche.png", 8, 2);
///					StdDraw.setPenColor(StdDraw.BLACK);
///					StdDraw.rectangle(13, 4, 4, 1);
///					StdDraw.text(13, 4, "Connaitre les règles");
///					f=0;
///				}
///				else{
///					
///				}
///				
///			}
///			if (StdDraw.mouseX()>=9 && StdDraw.mouseX()<=17 && StdDraw.mouseY()>=6 && StdDraw.mouseY()<=8){
///				if (g==0){
////					StdDraw.setPenColor(204,51,204);
///					--------StdDraw.filledRectangle(13, 7, 4, 1);
//					StdDraw.picture(13, 7, "casepickedblanche.png", 8, 2);
//					StdDraw.setPenColor(StdDraw.BLACK);
///					StdDraw.rectangle(13, 7, 4, 1);
///					StdDraw.text(13, 7, "Jouer");
///					g=1;
///				}
///				else {
///					
///				}
///				if (StdDraw.mousePressed()){
///					r= false;
///					choix = 0;
///				}
//				else {
//					
///				}
///			}
///			else {
///				if (g==1){
///					StdDraw.setPenColor(StdDraw.BLUE);
///					----------StdDraw.filledRectangle(13, 7, 4, 1);
///					StdDraw.picture(13, 7, "caseblanche.png", 8, 2);
///					StdDraw.setPenColor(StdDraw.BLACK);
//					StdDraw.rectangle(13, 7, 4, 1);
//					StdDraw.text(13, 7, "Jouer");
///					g=0;
//				}
//				else{
///					
//				}
//				
///			}
//		}
//		if (choix==1){
///			System.out.print("choix 1");
//			System.exit(0);
//		}
///		else if (choix==2)
//			System.out.print("choix 2");
//		else if ( choix==0){
///			System.out.print("choix 0");
//			choixJoueurs();
//		}
//		else 
//			System.out.print("echec");