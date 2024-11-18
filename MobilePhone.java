// CSE-111 LAB-2 UG TASK-4     []
// MobilePhone object.

public class MobilePhone {
    public int ContactCapacity = 0;
    public int Contact_num = 0;

    public String[] contacts;
    public int[] numbers;
    
    public void setContactCapacity(int ak){
        ContactCapacity = ak;

        contacts = new String[ak];
        numbers = new int[ak];
    }

    

    public int addContact(String kk, int nk){
        if (Contact_num < contacts.length && Contact_num < numbers.length) {
            System.out.println("The contact of " + kk +" is added.");
            contacts[Contact_num] = kk;
            numbers[Contact_num] = nk;

            Contact_num ++;
        }
        else if (ContactCapacity == Contact_num){
            System.out.println("Storage Full!!");
        }
        else{System.out.println("Storage Full!!");}

        return Contact_num;
    }

    public void makeCall(int jk){
        int tk = 0;
        boolean flag = false;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == jk) {
                tk = i;
                flag = true;
                break;
            }
            else{}
        }

        if (flag) {
            System.out.println("Calling " + contacts[tk] + " . . . . .");
        }
        else{System.out.println("Calling " + jk + " . . . . .");}
    }

    public void details(){
        System.out.println("Total Contacts : " + Contact_num);
        System.out.println("Contact List : ");
        for (int i = 0; i < Contact_num; i++) {
            System.out.println(i + ". " + contacts[i] + " : " + numbers[i] + " .");
        }
    }
}
 

