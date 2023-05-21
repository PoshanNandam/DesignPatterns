package org.example.creational.prototype;

public class Square extends Shape{

    int length;

    public Square(){}

    public Square(Square target){
        super(target);
        if(target!=null) this.length = target.length;
    }

    @Override
    public Shape clone() {
        return new Square(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Square square = (Square) o;
        return length == square.length;
    }

}
