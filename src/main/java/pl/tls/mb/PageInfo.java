package pl.tls.mb;

/**
 *
 * @author tlenczyk
 */
public enum PageInfo {

    HOME("Home", "/home.xhtml"),
    QUEUES("Queues", "/queues.xhtml"),
    JOBS("Jobs", "/jobs.xhtml"),
    NODES("Nodes", "/nodes.xhtml"),
    METRIX("Metrix", "/metrix.xhtml"),
    LOGS("Logs", "/logs.xhtml");
    private String title;
    private String outcome;

    private PageInfo(String title, String outcome) {
        this.title = title;
        this.outcome = outcome;
    }

    static String fromViewId(String viewId) {
        for (PageInfo pageInfo : PageInfo.values()) {
            if (pageInfo.getOutcome().equals(viewId)) {
                return pageInfo.getTitle();
            }
        }

        throw new IllegalArgumentException("Invalid viewId: " + viewId);
    }

    public String getTitle() {
        return title;
    }

    public String getOutcome() {
        return outcome;
    }
}
