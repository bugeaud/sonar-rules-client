package fr.bugeaud.tools.sonar.rules.client;

import java.util.ArrayList;
import java.util.List;

/**
 * Handle extract of rules scope from the SonarQube. 
 * @author bugeaud at gmail dot com
 * @licence CeCILL 2.1
 */
public class RulesExtract {
    private int total;
    private int p;
    private int ps;
    private List<SonarRule> rules = new ArrayList<>();

    /**
     * @return the total number of rules
     */
    public int getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(int total) {
        this.total = total;
    }

    /**
     * @return the p
     */
    public int getP() {
        return p;
    }

    /**
     * @param p the p to set
     */
    public void setP(int p) {
        this.p = p;
    }

    /**
     * @return the whole list of rules
     */
    public List<SonarRule> getRules() {
        return rules;
    }

    /**
     * @param rules the rules to set
     */
    public void setRules(List<SonarRule> rules) {
        this.rules = rules;
    }

    /**
     * @return the ps
     */
    public int getPs() {
        return ps;
    }
}
