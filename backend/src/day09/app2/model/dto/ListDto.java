package day09.app2.model.dto;

public class ListDto {
    private String number;
    private int people;

    public ListDto() {}
    public ListDto( String number, int people) {
        this.number = number;
        this.people = people;
    }

    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    public int getPeople(){
        return people;
    }
    public void setPeople(int people) {
        this.people = people;
    }
    @Override
    public String toString() {
        return "ListDto [number=" + number + ", people=" + people + "]";
    }
    
}