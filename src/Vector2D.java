
public class Vector2D {
    private float x;
    private float y;

    public Vector2D(){
        this.x = 0;
        this.y = 0;
    }
    public Vector2D(float x, float y){
        this.x = x;
        this.y = y;
    }

    public Vector2D setVector(float x, float y){
        this.x = x;
        this.y = y;
        return this;
    }

    //Vector Addition
    public Vector2D addVector(float x, float y){
        this.x += x;
        this.y += y;
        return this;
    }
    public Vector2D addVector(Vector2D vector2D){
        return this.addVector(vector2D.x, vector2D.y);
    }
    public Vector2D addVectorNew(float x, float y){
        return new Vector2D(this.x + x, this.y + y);
    }
    public Vector2D addVectorNew(Vector2D vector2D){
        return this.addVectorNew(vector2D.x, vector2D.y);
    }

    //Vector Subtraction
    public Vector2D subVector(float x, float y){
        this.x -= x;
        this.y -= y;
        return this;
    }
    public Vector2D subVector(Vector2D vector2D){
        return this.subVector(vector2D.x,vector2D.y);
    }

    //Vector Multiplication
    public Vector2D multiplyVector(float f){
        this.x *= x;
        this.y *= y;
        return this;
    }

    //Return Vector's Length
    public float length(){
        return (float)Math.sqrt(Math.pow(this.x,2)+ Math.pow(this.y,2));
    }

    //Return a copy of a Vector
    public Vector2D copyVector(Vector2D vector2D){
        return new Vector2D(vector2D.x, vector2D.y);
    }

    //Normalization of Vector
    public Vector2D normalizeVector(){
        float length = this.length();
        return new Vector2D(this.x / length, this.y / length);
    }

    //Rotation of Vector
    public Vector2D rotateVector(double angle){
        double radians = Math.toRadians(angle);
        double cos = Math.cos(radians);
        double sin = Math.sin(radians);
        float newX = (float)(this.x * cos - this.y * sin);
        float newY = (float)(this.x * sin  + this.y * cos);
        return new Vector2D(newX,newY);
    }
}
