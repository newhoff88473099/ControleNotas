import java.util.Arrays;
import java.text.DecimalFormat;
import java.util.Scanner;

public class GestaoDeNotas {

	public static void main(String[] args) {
		 int alunos = 3;
	        int alunosAprovados = 0, alunosReprovados = 0, alunosAF = 0;
	        
	        float notasAlunos[] = new float[alunos];
	        float notaTotal = 0;
	       
	        Scanner entrada = new Scanner (System.in);
	        
	        for (int i = 0; i < alunos; i++) {
	            
	            System.out.println("  MÉDIA SEMESTRAL  ");
	            System.out.println(" ");
	          
	            
	            System.out.println("Nota da prova no 1º Bimestre: ");
	            float nProva1b = entrada.nextFloat();
	            
	            System.out.println("Nota do projeto no 1º Bimestre: ");
	            float nProjeto1b = entrada.nextFloat();

	            System.out.println("Nota da lista de exercícios no 1º Bimestre: ");
	            float nListaExercicio1b = entrada.nextFloat();

	            
	            System.out.println("Nota da prova no 2º Bimestre: ");
	            float nProva2b = entrada.nextFloat();

	            System.out.println("Nota do projeto no 2º Bimestre: ");
	            float nProjeto2b = entrada.nextFloat();

	            System.out.println("Nota da lista de exercícios no 2º Bimestre: ");
	            float nListaExercicio2b = entrada.nextFloat();
	            
	            
	            float nota1Bimestre = ((nProva1b * 5 + nProjeto1b * 3 + nListaExercicio1b * 2) / 10);
	            float nota2Bimestre = ((nProva2b * 5 + nProjeto2b * 3 + nListaExercicio2b * 2) / 10);
	            
	            
	            float mediaSemestral =((nota1Bimestre + nota2Bimestre) / 2);
	            
	            
	            notaTotal += mediaSemestral;
	            
	            
	            notasAlunos[i] = (float)mediaSemestral;
	            
	            
	            if (mediaSemestral >= 8){
	                alunosAprovados++;
	            } else if (mediaSemestral <= 7.9 && mediaSemestral >= 5){
	                alunosAF++;
	            } else {
	                alunosReprovados++;
	            }
	        } 
	        
	        DecimalFormat fmt = new DecimalFormat("0.00");
	        Arrays.sort(notasAlunos);
	        
	        float mediaTurma = notaTotal/alunos;
	           
	        System.out.println("A média geral da turma é: " + fmt.format(mediaTurma));
	        System.out.println("A menor nota da turma é: " + fmt.format(notasAlunos[0]));
	        System.out.println("A maior nota da turma é: " + fmt.format(notasAlunos[notasAlunos.length - 1]));
	        System.out.println(" ");
	        System.out.println("Alunos aprovados: " + alunosAprovados);
	        System.out.println("Alunos reprovados: " + alunosReprovados);
	        System.out.println("Alunos em Avaliação Final: " + alunosAF);   
	    }
	}


