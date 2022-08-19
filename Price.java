package HomeWork.HomewWorkEnum;


public enum Price {
    500("500"), 400("400");

    private int price;

    Price(Integer price) {this.price= price;
    }


    public Integer getPrice() {
        return price;
    }
}
