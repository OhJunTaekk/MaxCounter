package access.ex2;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int itemCount = 0;

    public void addItem(Item item){
        if(items.length <= itemCount){
            System.out.println("장바구니가 가득 찼습니다.");
            return;
        }
        items[itemCount] = item;
        itemCount++;
    }

    public void displayItems(){
        int sum = 0;
        System.out.println("장바구니 상품 출력");
        for (int  i = 0; i < itemCount; i++) {
            Item item = items[i];
            System.out.println("상품명: " + item.getName() + ", 합계: " + item.getAllPrice());
            sum += item.getAllPrice();
        }
        System.out.println("전체 가격 합: " + sum);
    }
}
