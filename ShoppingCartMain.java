package access.ex2;

public class ShoppingCartMain {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item("마늘", 2000, 2);
        Item item2 = new Item("상추", 3000, 4);

        cart.addItem(item1);
        cart.addItem(item2);

        cart.displayItems();
    }
}


// 출력 결과
// 장바구니 상품 출력
// 상품명: 마늘, 합계: 4000
// 상품명: 상추, 합계: 12000
// 전체 가격 합: 16000

// 요구사항
// 접근 제어자를 사용해서 데이터를 캡슐화
// 해당 클래스는 다른 패키지에서도 사용 할 수 있음.
// 장바구니에는 상품을 최대 10개
    // 10개 초과 등록 시 : "장바구니가 가득 찼습니다" 출력