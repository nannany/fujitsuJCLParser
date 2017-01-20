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
     * @param order �Z�b�g���� order
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
     * @param content �Z�b�g���� content
     */
    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString(){
        return order + " " + content;
    }

}
