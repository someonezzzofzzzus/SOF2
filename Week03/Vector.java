

public class Vector{
    
    private   double[] vector;
    
    public Vector(double[] inputArray){

        vector = new double[inputArray.length];
        System.arraycopy(inputArray, 0, vector, 0, inputArray.length);

    }

    public String toString(){
        String answer = "[";
        for (double v: vector){
            answer += (v + " ");
        }
        answer += "]";
        return answer;
    }

    public int get_dimensions(){
        return vector.length;
    }

    public double  get_value(int position){
        double answer = vector[position];
        return answer;
        
    }

    public void  set_Value(int position, double value){
        if (vector[position] == value){
            System.out.println("Value is already on the position");
        }
        else {
            vector[position] = value;
            System.out.println("Value is set at the postion");
        }
        
    }

    public boolean  equal(Object other){

        if(this == other) return true;

        if (other == null) return false;

        Vector newVector = (Vector) other;

        if (newVector.vector.length != this.vector.length) return false;

        for (int i =0; i<vector.length; i++){
            if (this.vector[i] != newVector.vector[i]){
                return false;
            }
            
        }
        return true;
        
    }

    public static void main(String[] args){

        double[] example = {2.5, 2.5, 2.5};
        double[] example_2 = null;
        Vector Vector_1 = new Vector(example);
        Vector Vector_2 = new Vector(example_2);
        System.out.println(Vector_1.equal(null));

    }

    
}
