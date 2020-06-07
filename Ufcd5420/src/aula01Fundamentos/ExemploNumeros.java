package aula01Fundamentos;
import javax.swing.JOptionPane;
public class ExemploNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		float y;
		String xNum = JOptionPane.showInputDialog(null, "um numero inteiro: ");
		x = Integer.parseInt(xNum); //(JOptionPane.showInputDialog(null, "Digite o numero: "));
		String xNum2 = JOptionPane.showInputDialog(null, "um numero float: ");
		y = Float.parseFloat(xNum2); // (JOptionPane.showInputDialog(null, "Digite o numero: "));
		System.out.println(x+" " + y);
		
		int c ;
		final int iva = 23;  // constante IVA
		String xIva = JOptionPane.showInputDialog(null, "um numero inteiro para calculo de iva: ");
		c = Integer.parseInt(xIva);
		System.out.println("custo sem iva : " +  c);
		System.out.println("custo do iva : " +  (c * iva /100));
		System.out.println("custo do total : " +  (c * iva /100)+ c);
	
		System.out.println("Valores convertidos ");
	    y = (float)Float.parseFloat(xNum2);
		x = (int)Integer.parseInt(xNum);
		
		
		
		System.out.println(" O valor convertido de Inteiro para Float é " + y);
		System.out.println(" O valor convertido de float para  Inteiro é " + x);
		System.out.println("A soma do inteiro e o float é "+  (x +y) ); 
		

	}

}
