package com.xiangmu.wyxw.Bean;

import java.util.List;

public class Top {

    public String topicid;
    public String attendnum;
    public String topicName;
    public String imgsrc;
    public String deadline;
    public List<ArticlesEntity> articles;
    public String topicDesc;
    
    public List<ArticlesEntity> getArticles() {
        return articles;
    }

    public String getTopicDesc() {
        return topicDesc;
    }

    public class ArticlesEntity {

        public String city;
        public String docid;
        public String topicname;
        public String body;
        public String portrait;
        public String userid;
        public String topicid;
        public String oppositeval;
        public String nickname;
        public String ctime;
        public String supportval;
        public String imgsrc;
        public String hotval;
        
    }
}
