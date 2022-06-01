public class wallArea {
        private double width;
        private double height;


        public wallArea(){
            System.out.println("first constructor is called");

        }
        public wallArea(double width, double height) {
            if (height<0&&width<0){
                this.width=0;
                this.height=0;
            }
            this.width = width;
            this.height = height;
        }

        public double getWidth() {
            return width;
        }

        public void setWidth(double width) {
            if (width<0){
                this.width=0;
            }
            else {
                this.width = width;
            }

        }

        public double getHeight() {
            return height;
        }

        public void setHeight(double height) {
            if (height<0){
                this.height =0;
            }
            else {
                this.height = height;
            }

        }

        public double getArea() {

            return this.height*this.width ;
        }
}
