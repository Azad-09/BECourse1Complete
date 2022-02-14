package org.example;

public class Address {
        private String houseNo;
        private String city;
        private String state;
        private  int pincode;

        public Address(String houseNo, String city, String state, int pincode) {
            this.houseNo = houseNo;
            this.city = city;
            this.state = state;
            this.pincode = pincode;
        }

        public String getHouseNo() {
            return houseNo;
        }

        public void setHouseNo(String houseNo) {
            this.houseNo = houseNo;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public int getPincode() {
            return pincode;
        }

        public void setPincode(int pincode) {
            this.pincode = pincode;
        }

        @Override
        public String toString() {
            return "Address{" +
                    "houseNo='" + houseNo + '\'' +
                    ", city='" + city + '\'' +
                    ", state='" + state + '\'' +
                    ", pincode=" + pincode +
                    '}';
        }
}
