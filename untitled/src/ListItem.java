public abstract class ListItem {
    private ListItem rightlink;
    private ListItem leftlink;
    private void  next(){

    }
    private void previous(){

    }
    private void setNext(){

    }
    private void setPrevious(){

    }
    private  void compareTo(){

    }

    public ListItem getRightlink() {
        return rightlink;
    }

    public void setRightlink(ListItem rightlink) {
        this.rightlink = rightlink;
    }

    public ListItem getLeftlink() {
        return leftlink;
    }

    public void setLeftlink(ListItem leftlink) {
        this.leftlink = leftlink;
    }
}
