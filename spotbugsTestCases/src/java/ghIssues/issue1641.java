package ghIssues;

class Issue1641 {
    public boolean getCondition() {
        return true;
    }
    public void methodA() {
        boolean condition = getCondition();
        if(condition) {
            methodA();  // should report a warning here
        } else {
            return;
        }
    }
}
