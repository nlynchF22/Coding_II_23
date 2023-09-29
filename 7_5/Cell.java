public class Cell {
    private String nameOfCell = "";
    private boolean doorIsOpen;
    private int securityCode;

    public Cell(String name, boolean isOpen, int sc){
        nameOfCell = name;
        doorIsOpen = isOpen;
        securityCode = sc;
    }

    public String getNameOfCell(){
        return nameOfCell;
    }

    public boolean getDoorIsOpen(){
        return doorIsOpen;
    }

    public void openDoor(int sc){
        if(sc != securityCode){
            System.out.println("That is the wrong code");
        } else {
            if(doorIsOpen == true){
                System.out.println("The door is currently open");
                doorIsOpen = false;
                System.out.println("Door is now closed");
            }else{
                System.out.println("The door is currently closed");
                doorIsOpen = true;
                System.out.println("Door is now open");
            }
        }
    }
}
