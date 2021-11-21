import java.util.Arrays;
public class ScoreSystem
{
    int[] scores = new int[5];
    int max;
    int min;
    double score;
    public ScoreSystem(int j1, int j2, int j3, int j4, int j5){
        scores[0]=j1;
        scores[1]=j2;
        scores[2]=j3;
        scores[3]=j4;
        scores[4]=j5;
    }
    
    public void calculate(){
        Arrays.sort(scores);
        min = scores[0];
        max = scores[scores.length-1];
        score = (scores[1]+scores[2]+scores[3])/3; 
    }
    public String toString(){
        return "Min: "+min+"\nMax: "+max+"\nScore: "+score;
    }
    public static void main(String[] args){
    ScoreSystem comp1 = new ScoreSystem(2,4,3,1,2);
    ScoreSystem comp2 = new ScoreSystem(5,5,3,3,1);
    ScoreSystem comp3 = new ScoreSystem(5,5,5,3,3);
    comp1.calculate();
    comp2.calculate();
    comp3.calculate();
    System.out.println(comp1);
    System.out.println(comp2);
    System.out.println(comp3);
    }
}
