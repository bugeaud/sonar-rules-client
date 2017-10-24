package fr.bugeaud.tools.sonar.rules.client;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Stores a SonarQube rule as an object
 * @author bugeaud at gmail dot com
 * @licence CeCILL 2.1
 */
public class SonarRule {
    private String key;
    private String repo;
    private String name;
    private String type;
    private Date createdAt;
    private String severity;
    private String status;
    private String internalKey;
    private String isTemplate;
    private String templateKey;
    private List<String> tags;
    private List<String> sysTags;
    private String lang;
    private String langName;
    private String htmlDesc;
    private String mdDesc;
    private String noteLogin;
    private String mdNote;
    private String htmlNote;
    private String defaultDebtRemFn;
    private String effortToFixDescription;
    private String debtOverloaded;
    private String debtRemFn;
    private String defaultRemFn;
    private String gapDescription;
    private String remFnOverloaded;
    private String remFn;
    private List<Map<String,String>> params;
    private String actives;
    private String defaultDebtRemFnType;
    private String defaultDebtRemFnOffset;
    private String defaultRemFnType;
    private String defaultRemFnBaseEffort;
    private String debtRemFnType;
    private String debtRemFnOffset;
    private String remFnType;
    private String remFnBaseEffort;
    private String defaultDebtRemFnCoeff;
    private String debtRemFnCoeff;
    private String defaultRemFnGapMultiplier;
    private String remFnGapMultiplier;

    /**
     * @return the repo
     */
    public String getRepo() {
        return repo;
    }

    /**
     * @param repo the repo to set
     */
    public void setRepo(String repo) {
        this.repo = repo;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the createdAt
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * @param createdAt the createdAt to set
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * @return the severity
     */
    public String getSeverity() {
        return severity;
    }

    /**
     * @param severity the severity to set
     */
    public void setSeverity(String severity) {
        this.severity = severity;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the internalKey
     */
    public String getInternalKey() {
        return internalKey;
    }

    /**
     * @param internalKey the internalKey to set
     */
    public void setInternalKey(String internalKey) {
        this.internalKey = internalKey;
    }

    /**
     * @return the isTemplate
     */
    public String getIsTemplate() {
        return isTemplate;
    }

    /**
     * @param isTemplate the isTemplate to set
     */
    public void setIsTemplate(String isTemplate) {
        this.isTemplate = isTemplate;
    }

    /**
     * @return the templateKey
     */
    public String getTemplateKey() {
        return templateKey;
    }

    /**
     * @param templateKey the templateKey to set
     */
    public void setTemplateKey(String templateKey) {
        this.templateKey = templateKey;
    }

    /**
     * @return the lang
     */
    public String getLang() {
        return lang;
    }

    /**
     * @param lang the lang to set
     */
    public void setLang(String lang) {
        this.lang = lang;
    }

    /**
     * @return the langName
     */
    public String getLangName() {
        return langName;
    }

    /**
     * @param langName the langName to set
     */
    public void setLangName(String langName) {
        this.langName = langName;
    }

    /**
     * @return the htmlDesc
     */
    public String getHtmlDesc() {
        return htmlDesc;
    }

    /**
     * @param htmlDesc the htmlDesc to set
     */
    public void setHtmlDesc(String htmlDesc) {
        this.htmlDesc = htmlDesc;
    }

    /**
     * @return the mdDesc
     */
    public String getMdDesc() {
        return mdDesc;
    }

    /**
     * @param mdDesc the mdDesc to set
     */
    public void setMdDesc(String mdDesc) {
        this.mdDesc = mdDesc;
    }

    /**
     * @return the noteLogin
     */
    public String getNoteLogin() {
        return noteLogin;
    }

    /**
     * @param noteLogin the noteLogin to set
     */
    public void setNoteLogin(String noteLogin) {
        this.noteLogin = noteLogin;
    }

    /**
     * @return the mdNote
     */
    public String getMdNote() {
        return mdNote;
    }

    /**
     * @param mdNote the mdNote to set
     */
    public void setMdNote(String mdNote) {
        this.mdNote = mdNote;
    }

    /**
     * @return the htmlNote
     */
    public String getHtmlNote() {
        return htmlNote;
    }

    /**
     * @param htmlNote the htmlNote to set
     */
    public void setHtmlNote(String htmlNote) {
        this.htmlNote = htmlNote;
    }

    /**
     * @return the defaultDebtRemFn
     */
    public String getDefaultDebtRemFn() {
        return defaultDebtRemFn;
    }

    /**
     * @param defaultDebtRemFn the defaultDebtRemFn to set
     */
    public void setDefaultDebtRemFn(String defaultDebtRemFn) {
        this.defaultDebtRemFn = defaultDebtRemFn;
    }

    /**
     * @return the effortToFixDescription
     */
    public String getEffortToFixDescription() {
        return effortToFixDescription;
    }

    /**
     * @param effortToFixDescription the effortToFixDescription to set
     */
    public void setEffortToFixDescription(String effortToFixDescription) {
        this.effortToFixDescription = effortToFixDescription;
    }

    /**
     * @return the debtOverloaded
     */
    public String getDebtOverloaded() {
        return debtOverloaded;
    }

    /**
     * @param debtOverloaded the debtOverloaded to set
     */
    public void setDebtOverloaded(String debtOverloaded) {
        this.debtOverloaded = debtOverloaded;
    }

    /**
     * @return the debtRemFn
     */
    public String getDebtRemFn() {
        return debtRemFn;
    }

    /**
     * @param debtRemFn the debtRemFn to set
     */
    public void setDebtRemFn(String debtRemFn) {
        this.debtRemFn = debtRemFn;
    }

    /**
     * @return the defaultRemFn
     */
    public String getDefaultRemFn() {
        return defaultRemFn;
    }

    /**
     * @param defaultRemFn the defaultRemFn to set
     */
    public void setDefaultRemFn(String defaultRemFn) {
        this.defaultRemFn = defaultRemFn;
    }

    /**
     * @return the gapDescription
     */
    public String getGapDescription() {
        return gapDescription;
    }

    /**
     * @param gapDescription the gapDescription to set
     */
    public void setGapDescription(String gapDescription) {
        this.gapDescription = gapDescription;
    }

    /**
     * @return the remFnOverloaded
     */
    public String getRemFnOverloaded() {
        return remFnOverloaded;
    }

    /**
     * @param remFnOverloaded the remFnOverloaded to set
     */
    public void setRemFnOverloaded(String remFnOverloaded) {
        this.remFnOverloaded = remFnOverloaded;
    }

    /**
     * @return the remFn
     */
    public String getRemFn() {
        return remFn;
    }

    /**
     * @param remFn the remFn to set
     */
    public void setRemFn(String remFn) {
        this.remFn = remFn;
    }

    /**
     * @return the params
     */
    public List<Map<String,String>> getParams() {
        return params;
    }

    /**
     * @param params the params to set
     */
    public void setParams(List<Map<String,String>> params) {
        this.params = params;
    }

    /**
     * @return the actives
     */
    public String getActives() {
        return actives;
    }

    /**
     * @param actives the actives to set
     */
    public void setActives(String actives) {
        this.actives = actives;
    }

    /**
     * @return the key
     */
    public String getKey() {
        return key;
    }

    /**
     * @param key the key to set
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * @param sysTags the sysTags to set
     */
    public void setSysTags(List<String> sysTags) {
        this.sysTags = sysTags;
    }

    /**
     * @param tags the tags to set
     */
    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    /**
     * @return the sysTags
     */
    public List<String> getSysTags() {
        return sysTags;
    }

    /**
     * @return the tags
     */
    public List<String> getTags() {
        return tags;
    }

    /**
     * @return the defaultDebtRemFnType
     */
    public String getDefaultDebtRemFnType() {
        return defaultDebtRemFnType;
    }

    /**
     * @param defaultDebtRemFnType the defaultDebtRemFnType to set
     */
    public void setDefaultDebtRemFnType(String defaultDebtRemFnType) {
        this.defaultDebtRemFnType = defaultDebtRemFnType;
    }

    /**
     * @return the defaultDebtRemFnOffset
     */
    public String getDefaultDebtRemFnOffset() {
        return defaultDebtRemFnOffset;
    }

    /**
     * @param defaultDebtRemFnOffset the defaultDebtRemFnOffset to set
     */
    public void setDefaultDebtRemFnOffset(String defaultDebtRemFnOffset) {
        this.defaultDebtRemFnOffset = defaultDebtRemFnOffset;
    }

    /**
     * @return the defaultRemFnType
     */
    public String getDefaultRemFnType() {
        return defaultRemFnType;
    }

    /**
     * @param defaultRemFnType the defaultRemFnType to set
     */
    public void setDefaultRemFnType(String defaultRemFnType) {
        this.defaultRemFnType = defaultRemFnType;
    }

    /**
     * @return the defaultRemFnBaseEffort
     */
    public String getDefaultRemFnBaseEffort() {
        return defaultRemFnBaseEffort;
    }

    /**
     * @param defaultRemFnBaseEffort the defaultRemFnBaseEffort to set
     */
    public void setDefaultRemFnBaseEffort(String defaultRemFnBaseEffort) {
        this.defaultRemFnBaseEffort = defaultRemFnBaseEffort;
    }

    /**
     * @return the debtRemFnType
     */
    public String getDebtRemFnType() {
        return debtRemFnType;
    }

    /**
     * @param debtRemFnType the debtRemFnType to set
     */
    public void setDebtRemFnType(String debtRemFnType) {
        this.debtRemFnType = debtRemFnType;
    }

    /**
     * @return the debtRemFnOffset
     */
    public String getDebtRemFnOffset() {
        return debtRemFnOffset;
    }

    /**
     * @param debtRemFnOffset the debtRemFnOffset to set
     */
    public void setDebtRemFnOffset(String debtRemFnOffset) {
        this.debtRemFnOffset = debtRemFnOffset;
    }

    /**
     * @return the remFnType
     */
    public String getRemFnType() {
        return remFnType;
    }

    /**
     * @param remFnType the remFnType to set
     */
    public void setRemFnType(String remFnType) {
        this.remFnType = remFnType;
    }

    /**
     * @return the remFnBaseEffort
     */
    public String getRemFnBaseEffort() {
        return remFnBaseEffort;
    }

    /**
     * @param remFnBaseEffort the remFnBaseEffort to set
     */
    public void setRemFnBaseEffort(String remFnBaseEffort) {
        this.remFnBaseEffort = remFnBaseEffort;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the defaultDebtRemFnCoeff
     */
    public String getDefaultDebtRemFnCoeff() {
        return defaultDebtRemFnCoeff;
    }

    /**
     * @param defaultDebtRemFnCoeff the defaultDebtRemFnCoeff to set
     */
    public void setDefaultDebtRemFnCoeff(String defaultDebtRemFnCoeff) {
        this.defaultDebtRemFnCoeff = defaultDebtRemFnCoeff;
    }

    /**
     * @return the debtRemFnCoeff
     */
    public String getDebtRemFnCoeff() {
        return debtRemFnCoeff;
    }

    /**
     * @param debtRemFnCoeff the debtRemFnCoeff to set
     */
    public void setDebtRemFnCoeff(String debtRemFnCoeff) {
        this.debtRemFnCoeff = debtRemFnCoeff;
    }

    /**
     * @return the defaultRemFnGapMultiplier
     */
    public String getDefaultRemFnGapMultiplier() {
        return defaultRemFnGapMultiplier;
    }

    /**
     * @param defaultRemFnGapMultiplier the defaultRemFnGapMultiplier to set
     */
    public void setDefaultRemFnGapMultiplier(String defaultRemFnGapMultiplier) {
        this.defaultRemFnGapMultiplier = defaultRemFnGapMultiplier;
    }

    /**
     * @return the remFnGapMultiplier
     */
    public String getRemFnGapMultiplier() {
        return remFnGapMultiplier;
    }

    /**
     * @param remFnGapMultiplier the remFnGapMultiplier to set
     */
    public void setRemFnGapMultiplier(String remFnGapMultiplier) {
        this.remFnGapMultiplier = remFnGapMultiplier;
    }
}
