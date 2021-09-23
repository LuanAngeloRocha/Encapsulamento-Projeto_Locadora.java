public class ProgramaEncaps {
	public static void main(String[] args) {
		/*Criação do objeto */
		Filme f = new Filme();
		f.setCodigo(123);
		f.setNome("A Era do Gelo");
		f.setValor(2.50);
		f.devolver ();
		
		f.mostra();
		
		f.retirar();
		
		f.mostra();
		
		try {
			f.retirar();
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
		
		
	}
}