/*
🔹 Mini Project (1 Hour) → Browsing History Manager
   - Use `LinkedList` to store browsing history
   - Implement back/forward navigation
   - Handle exceptions for invalid page requests
*/


import java.util.LinkedList;
class BrowsingHistory {
    private LinkedList<String> history;
    private int currentIndex;

    public BrowsingHistory() {
        history = new LinkedList<>();
        currentIndex = -1; // No pages are visited yet

    }

    // Visit a page
    public void visitPage(String url) {
        // Remove forward history when a page is visited
       if (currentIndex < history.size()-1) {
           while (history.size() > currentIndex + 1) {
               history.removeLast();
           }
       }
        history.add(url);
        currentIndex++;
        System.out.println("Visited: " + url);
    }


// Go Back to History

    public String goBack() {
        if (currentIndex > 0) {
            currentIndex--;
            return "Back to: " + history.get(currentIndex);
        } else {
            return "No previous page.";
        }

    }

    // Get forward in history
    public String goForward() {
        if (currentIndex < history.size() - 1) {
            return "Forward to: " + history.get(currentIndex);
        } else {
            return "No next Page. ";
        }
    }

        // Get the Current Page
        public String getCurrentPage() {
            if (currentIndex == -1) {
                return "No Pages visited";

            }
            return "Current Page: " + history.get(currentIndex);
        }
    }



public class BrowsingHistoryManager {
    public static void main(String[] args) {
BrowsingHistory browsingHistory = new BrowsingHistory();

browsingHistory.visitPage("google.com");
browsingHistory.visitPage("facebook.com");
browsingHistory.visitPage("instagram.com");
        System.out.println(browsingHistory.goBack());    // Back to facebook.com
        System.out.println(browsingHistory.goBack());    // Back to google.com
        System.out.println(browsingHistory.goForward()); // Forward to facebook.com
        System.out.println(browsingHistory.getCurrentPage()); // facebook.com

    }
}