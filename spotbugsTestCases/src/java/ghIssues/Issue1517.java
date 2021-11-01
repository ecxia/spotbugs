package ghIssues;

public class Issue1517 {
    void test00(){
        int i = 0;
        i = 2 + (i++); // no warning (false negative)'
    }
    
    // void test01(){
    //     int i = 0;
    //     i = (i++) + 2; // no warning (false negative)'
    // }
    
    // void test02(){
    //     int i = 0;
    //     i = (i--) - 2; // no warning (false negative)'
    // }
    
    
    // void test03(){
    //     int i = 0;
    //     i = 2 + (i--); // no warning (false negative)'
    // }    
}
