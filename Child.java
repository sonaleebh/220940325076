class GrandParent
{
    String grandFatherName;
    String grandMotherName;
    public GrandParent(String grandFatherName,String grandMotherName)
    {
        this.grandFatherName=grandFatherName;
        this.grandMotherName=grandMotherName;
        System.out.println("GrandFather name is: "+grandFatherName+" and Grandmother name is: "+grandMotherName);

    }


}

class Parent extends GrandParent
{
    String fatherName;
    String motherName;
    public Parent(String fatherName,String motherName,String grandFatherName,String grandMotherName)
    {
        this(grandFatherName,grandMotherName);
        System.out.println("FatherName: "+fatherName+" MotherName: "+motherName);
    }
    public Parent(String grandFatherName,String grandMotherName)
    {
        super(grandFatherName,grandMotherName);

    }
}

class Child extends Parent
{
    Child(String fatherName, String motherName, String grandFatherName, String grandMotherName) {
        super(fatherName, motherName, grandFatherName, grandMotherName);
    }

    Child(String grandFatherName, String grandMotherName) {
        super(grandFatherName, grandMotherName);
    }


    public static void main(String[] args) {
        Parent p=new Child("Ashok","Nanda","Gopala","Krushna");

    }
}
