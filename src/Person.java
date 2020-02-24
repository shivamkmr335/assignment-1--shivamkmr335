
    public class Person{
        private String Fname;
        private String Lname;
        public long[] phone=new long[100];
        private String mail;
        public Person next;

        public String getFname() {
            return Fname;
        }

        public String getLname() {
            return Lname;
        }

        public String getMail() {
            return mail;
        }

        public void setFname(String fname) {
            Fname = fname;
        }

        public void setLname(String lname) {
            Lname = lname;
        }

        public void setMail(String mail) {
            this.mail = mail;
        }
    }

