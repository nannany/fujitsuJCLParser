package expressions;

public class SpaceDef {
    private String order;
    private String content;

    /**
     * @return order
     */
    public String getOrder() {
        return order;
    }

    /**
     * @param order セットする order
     */
    public void setOrder(String order) {
        this.order = order;
    }

    /**
     * @return content
     */
    public String getContent() {
        return content;
    }

    /**
     * @param content セットする content
     */
    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString(){
        return order + " " + content;
    }

}
