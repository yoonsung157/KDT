package day14;

import java.util.ArrayList;
import java.util.List;

public class Practice15 {
    public static void main(String[] args) {
        List <InventorySlot <?> > inventory = new ArrayList<>();

        InventorySlot<String> slot1 = new InventorySlot();
        slot1.setSlotNumber(1);
        slot1.setData("집행자의 검");
        inventory.add(slot1);
        System.out.println( inventory.get(0).getData() );

        InventorySlot< Integer > slot2 = new InventorySlot();
        slot2.setSlotNumber(2);
        slot2.setData(500000);
        inventory.add(slot2);

        InventorySlot< Double > slot3 = new InventorySlot();
        slot3.setSlotNumber(3);
        slot3.setData(85.5);
        inventory.add(slot3);

        InventorySlot< String > slot4 = new InventorySlot();
        slot4.setSlotNumber(4);
        slot4.setData("드래곤 갑옷");
        inventory.add(slot4);

        System.out.println("=== 인벤토리 슬롯 목록 ===");
        inventory.forEach( ( inven ) -> { 
            System.out.print("[슬롯 " + inven.getSlotNumber() + "번] 보관 : ");
            System.out.println(inven.getData());
        } );
    }
}

class InventorySlot< T > {
    private int slotNumber;
    private T data;

    public T getData() {
        return data;
    }
    public void setData(T data) {
        this.data = data;
    }
    public void setSlotNumber(int slotNumber) {
        this.slotNumber = slotNumber;
    }
    public int getSlotNumber() {
        return slotNumber;
    }
}