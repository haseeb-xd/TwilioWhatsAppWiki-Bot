package com.bot.duckduckapi;
import java.util.ArrayList;

public class WikiModel
{
    public static  class Content
    {
        public String data_type;

        public String getData_type()
        {
            return data_type;
        }

        public void setData_type(String data_type)
        {
            this.data_type = data_type;
        }

        public String getLabel()
        {
            return label;
        }

        public void setLabel(String label)
        {
            this.label = label;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value)
        {
            this.value = value;
        }

        public Object getWiki_order()
        {
            return wiki_order;
        }

        public void setWiki_order(Object wiki_order)
        {
            this.wiki_order = wiki_order;
        }

        public String label;
        public String value;
        public Object wiki_order;
    }
    
    public static class Meta
    {
        public String data_type;
        public String label;
        public String value;
        public Object attribution;
        public Object blockgroup;
        public Object created_date;

        public String getData_type()
        {
            return data_type;
        }

        public void setData_type(String data_type)
        {
            this.data_type = data_type;
        }

        public String getLabel()
        {
            return label;
        }

        public void setLabel(String label) {
            this.label = label;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public Object getAttribution() {
            return attribution;
        }

        public void setAttribution(Object attribution) {
            this.attribution = attribution;
        }

        public Object getBlockgroup() {
            return blockgroup;
        }

        public void setBlockgroup(Object blockgroup) {
            this.blockgroup = blockgroup;
        }

        public Object getCreated_date() {
            return created_date;
        }

        public void setCreated_date(Object created_date) {
            this.created_date = created_date;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public Object getDesigner() {
            return designer;
        }

        public void setDesigner(Object designer) {
            this.designer = designer;
        }

        public Object getDev_date() {
            return dev_date;
        }

        public void setDev_date(Object dev_date) {
            this.dev_date = dev_date;
        }

        public String getDev_milestone() {
            return dev_milestone;
        }

        public void setDev_milestone(String dev_milestone) {
            this.dev_milestone = dev_milestone;
        }

        public ArrayList<Developer> getDeveloper() {
            return developer;
        }

        public void setDeveloper(ArrayList<Developer> developer) {
            this.developer = developer;
        }

        public String getExample_query() {
            return example_query;
        }

        public void setExample_query(String example_query) {
            this.example_query = example_query;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public Object getIs_stackexchange() {
            return is_stackexchange;
        }

        public void setIs_stackexchange(Object is_stackexchange) {
            this.is_stackexchange = is_stackexchange;
        }

        public String getJs_callback_name() {
            return js_callback_name;
        }

        public void setJs_callback_name(String js_callback_name) {
            this.js_callback_name = js_callback_name;
        }

        public Object getLive_date() {
            return live_date;
        }

        public void setLive_date(Object live_date) {
            this.live_date = live_date;
        }

        public Maintainer getMaintainer() {
            return maintainer;
        }

        public void setMaintainer(Maintainer maintainer) {
            this.maintainer = maintainer;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPerl_module() {
            return perl_module;
        }

        public void setPerl_module(String perl_module) {
            this.perl_module = perl_module;
        }

        public Object getProducer() {
            return producer;
        }

        public void setProducer(Object producer) {
            this.producer = producer;
        }

        public String getProduction_state() {
            return production_state;
        }

        public void setProduction_state(String production_state) {
            this.production_state = production_state;
        }

        public String getRepo() {
            return repo;
        }

        public void setRepo(String repo) {
            this.repo = repo;
        }

        public String getSignal_from() {
            return signal_from;
        }

        public void setSignal_from(String signal_from) {
            this.signal_from = signal_from;
        }

        public String getSrc_domain() {
            return src_domain;
        }

        public void setSrc_domain(String src_domain) {
            this.src_domain = src_domain;
        }

        public int getSrc_id() {
            return src_id;
        }

        public void setSrc_id(int src_id) {
            this.src_id = src_id;
        }

        public String getSrc_name() {
            return src_name;
        }

        public void setSrc_name(String src_name) {
            this.src_name = src_name;
        }

        public SrcOptions getSrc_options() {
            return src_options;
        }

        public void setSrc_options(SrcOptions src_options) {
            this.src_options = src_options;
        }

        public Object getSrc_url() {
            return src_url;
        }

        public void setSrc_url(Object src_url) {
            this.src_url = src_url;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getTab() {
            return tab;
        }

        public void setTab(String tab) {
            this.tab = tab;
        }

        public ArrayList<String> getTopic() {
            return topic;
        }

        public void setTopic(ArrayList<String> topic) {
            this.topic = topic;
        }

        public int getUnsafe() {
            return unsafe;
        }

        public void setUnsafe(int unsafe) {
            this.unsafe = unsafe;
        }

        public String description;
        public Object designer;
        public Object dev_date;
        public String dev_milestone;
        public ArrayList<Developer> developer;
        public String example_query;
        public String id;
        public Object is_stackexchange;
        public String js_callback_name;
        public Object live_date;
        public Maintainer maintainer;
        public String name;
        public String perl_module;
        public Object producer;
        public String production_state;
        public String repo;
        public String signal_from;
        public String src_domain;
        public int src_id;
        public String src_name;
        public SrcOptions src_options;
        public Object src_url;
        public String status;
        public String tab;
        public ArrayList<String> topic;
        public int unsafe;
    }
    
    public static class Infobox{
        public ArrayList<Content> getContent() {
            return content;
        }

        public void setContent(ArrayList<Content> content) {
            this.content = content;
        }

        public ArrayList<Meta> getMeta() {
            return meta;
        }

        public void setMeta(ArrayList<Meta> meta) {
            this.meta = meta;
        }

        public ArrayList<Content> content;
        public ArrayList<Meta> meta;
    }
    
    public static  class Icon{
    
        public String height;

        public String getHeight() {
            return height;
        }

        public void setHeight(String height) {
            this.height = height;
        }

        public String getuRL() {
            return uRL;
        }

        public void setuRL(String uRL) {
            this.uRL = uRL;
        }

        public String getWidth() {
            return width;
        }

        public void setWidth(String width) {
            this.width = width;
        }

        public String uRL;
        public String width;
    }
    
    public static  class RelatedTopic{
     
        public String firstURL;
        public Icon icon;

        public String getFirstURL() {
            return firstURL;
        }

        public void setFirstURL(String firstURL) {
            this.firstURL = firstURL;
        }

        public Icon getIcon() {
            return icon;
        }

        public void setIcon(Icon icon) {
            this.icon = icon;
        }

        public String getResult() {
            return result;
        }

        public void setResult(String result) {
            this.result = result;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public String result;
        public String text;
    }

    public String getAbstract() {
        return Abstract;
    }

    public void setAbstract(String anAbstract) {
        Abstract = anAbstract;
    }

    public String getAbstractSource() {
        return abstractSource;
    }

    public void setAbstractSource(String abstractSource) {
        this.abstractSource = abstractSource;
    }

    public String getAbstractText() {
        return abstractText;
    }

    public void setAbstractText(String abstractText) {
        this.abstractText = abstractText;
    }

    public String getAbstractURL() {
        return abstractURL;
    }

    public void setAbstractURL(String abstractURL) {
        this.abstractURL = abstractURL;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getAnswerType() {
        return answerType;
    }

    public void setAnswerType(String answerType) {
        this.answerType = answerType;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    public String getDefinitionSource() {
        return definitionSource;
    }

    public void setDefinitionSource(String definitionSource) {
        this.definitionSource = definitionSource;
    }

    public String getDefinitionURL() {
        return definitionURL;
    }

    public void setDefinitionURL(String definitionURL) {
        this.definitionURL = definitionURL;
    }

    public String getEntity() {
        return entity;
    }

    public void setEntity(String entity) {
        this.entity = entity;
    }

    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getImageHeight() {
        return imageHeight;
    }

    public void setImageHeight(int imageHeight) {
        this.imageHeight = imageHeight;
    }

    public int getImageIsLogo() {
        return imageIsLogo;
    }

    public void setImageIsLogo(int imageIsLogo) {
        this.imageIsLogo = imageIsLogo;
    }

    public int getImageWidth() {
        return imageWidth;
    }

    public void setImageWidth(int imageWidth) {
        this.imageWidth = imageWidth;
    }

    public Infobox getInfobox() {
        return infobox;
    }

    public void setInfobox(Infobox infobox) {
        this.infobox = infobox;
    }

    public String getRedirect() {
        return redirect;
    }

    public void setRedirect(String redirect) {
        this.redirect = redirect;
    }

    public ArrayList<RelatedTopic> getRelatedTopics() {
        return relatedTopics;
    }

    public void setRelatedTopics(ArrayList<RelatedTopic> relatedTopics) {
        this.relatedTopics = relatedTopics;
    }

    public ArrayList<Result> getResults() {
        return results;
    }

    public void setResults(ArrayList<Result> results) {
        this.results = results;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    public static class Result{
        public String getFirstURL() {
            return firstURL;
        }

        public void setFirstURL(String firstURL) {
            this.firstURL = firstURL;
        }

        public Icon getIcon() {
            return icon;
        }

        public void setIcon(Icon icon) {
            this.icon = icon;
        }

        public String getResult() {
            return result;
        }

        public void setResult(String result) {
            this.result = result;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public String firstURL;
        public Icon icon;
        public String result;
        public String text;
    }
    
    public static class Developer{
        public String name;
        public String type;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String url;
    }
    
    public static class Maintainer{
        public String github;

        public String getGithub() {
            return github;
        }

        public void setGithub(String github) {
            this.github = github;
        }
    }
    
    public static class SrcOptions{
        public String directory;
        public int is_fanon;
        public int is_mediawiki;
        public int is_wikipedia;
        public String language;

        public String getDirectory() {
            return directory;
        }

        public void setDirectory(String directory) {
            this.directory = directory;
        }

        public int getIs_fanon() {
            return is_fanon;
        }

        public void setIs_fanon(int is_fanon) {
            this.is_fanon = is_fanon;
        }

        public int getIs_mediawiki() {
            return is_mediawiki;
        }

        public void setIs_mediawiki(int is_mediawiki) {
            this.is_mediawiki = is_mediawiki;
        }

        public int getIs_wikipedia() {
            return is_wikipedia;
        }

        public void setIs_wikipedia(int is_wikipedia) {
            this.is_wikipedia = is_wikipedia;
        }

        public String getLanguage() {
            return language;
        }

        public void setLanguage(String language) {
            this.language = language;
        }

        public String getMin_abstract_length() {
            return min_abstract_length;
        }

        public void setMin_abstract_length(String min_abstract_length) {
            this.min_abstract_length = min_abstract_length;
        }

        public int getSkip_abstract() {
            return skip_abstract;
        }

        public void setSkip_abstract(int skip_abstract) {
            this.skip_abstract = skip_abstract;
        }

        public int getSkip_abstract_paren() {
            return skip_abstract_paren;
        }

        public void setSkip_abstract_paren(int skip_abstract_paren) {
            this.skip_abstract_paren = skip_abstract_paren;
        }

        public String getSkip_end() {
            return skip_end;
        }

        public void setSkip_end(String skip_end) {
            this.skip_end = skip_end;
        }

        public int getSkip_icon() {
            return skip_icon;
        }

        public void setSkip_icon(int skip_icon) {
            this.skip_icon = skip_icon;
        }

        public int getSkip_image_name() {
            return skip_image_name;
        }

        public void setSkip_image_name(int skip_image_name) {
            this.skip_image_name = skip_image_name;
        }

        public String getSkip_qr() {
            return skip_qr;
        }

        public void setSkip_qr(String skip_qr) {
            this.skip_qr = skip_qr;
        }

        public String getSource_skip() {
            return source_skip;
        }

        public void setSource_skip(String source_skip) {
            this.source_skip = source_skip;
        }

        public String getSrc_info() {
            return src_info;
        }

        public void setSrc_info(String src_info) {
            this.src_info = src_info;
        }

        public String min_abstract_length;
        public int skip_abstract;
        public int skip_abstract_paren;
        public String skip_end;
        public int skip_icon;
        public int skip_image_name;
        public String skip_qr;
        public String source_skip;
        public String src_info;
    }
    

    public String Abstract;
    public String abstractSource;
    public String abstractText;
    public String abstractURL;
    public String answer;
    public String answerType;
    public String definition;
    public String definitionSource;
    public String definitionURL;
    public String entity;
    public String heading;
    public String image;
    public int imageHeight;
    public int imageIsLogo;
    public int imageWidth;
    public Infobox infobox;
    public String redirect;
    public ArrayList<RelatedTopic> relatedTopics;
    public ArrayList<Result> results; 
    public String type;
    public Meta meta;
}

