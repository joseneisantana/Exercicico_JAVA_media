package newproject;

public class ClassCalc {

	public static void main(String[] args) {
		
		String nome = "Jordan";
		String sobrenome ="Santana";
		final String matricula ="41545151";
	    int idade= 19;
		String nomePai ="Ney";
		String nomeMae ="Ana";
		boolean temAutorização = true;
		
     System.out.println("####################################");
      System.out.println("Matricula"+ ":"+ matricula);
	  System.out.println("Aluno"+" :"+nome +" " + sobrenome );
      System.out.println("Idade"+":"+idade +" "+ "Anos");
      System.out.println("Nome do Pai"+":"+ nomePai +" " + sobrenome );
      System.out.println("Nome do Mãe"+":"+ nomeMae +" " + sobrenome );
      System.out.println(temAutorização);
      
      
//      Cuculo media
      
      double n1 = 9;
      double n2 = 9;
      double n3 = 8;
      double n4 = 8;
      
      double media = (n1 + n2+ n3 + n4)/4; 
      
      System.out.println("Média Final"+":"+ media);
      System.out.println("####################################");
	}

}
