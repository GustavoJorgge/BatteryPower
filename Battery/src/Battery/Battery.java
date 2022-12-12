/* Escreva uma função que receba n registros do consumo de bateria do laptop e eventos de decarregamento.
 * Um valor [i] representa o numero de minutos gastos de carregando o laptop (valor positivo) ou um jogo
 * - consumo (valor negativo). A cada minuto, o laptop consome 1% de bateria. A carga da bateria não pode
 * exceder 100%. Retorne a porcentagem de cobrança final do laptop, pois a carga inicial é de 50%.
 * Faça uma funçao getBattery. A funçao deve retornar um numero inteiro.
 */

package Battery;
import java.util.Scanner;

public class Battery {	
	static Scanner ler = new Scanner(System.in);	
	
	static int getBattery(int eventos[]) {		
		int carga = 0;
		
		for( int i = 1 ; i <= eventos.length ; i++ ) {
			carga += eventos[i-1];
			if( carga >= 100 ) {
				carga = 100;
			}else if( carga <= 0 ){
				carga = 0;
			}else{				
			}
		}		
		return carga;
	}
	
	public static void main(String[] args) {
		
		int qtd, registro,total = 0;		
		
		System.out.printf("Entre com a quantidade de registros: ");
		qtd = ler.nextInt();
		
		int eventos[]= new int [qtd+1];
		eventos[0] = 50;		
		
		for ( int i = 1 ; i < eventos.length ; i++ ) {
			System.out.printf("%d° registro:",i);
			registro = ler.nextInt();
			eventos[i] = registro;			
		}
		
		getBattery(eventos);			
		total = getBattery(eventos);	
		
		System.out.printf("Carga final: %d", total);
	}

}