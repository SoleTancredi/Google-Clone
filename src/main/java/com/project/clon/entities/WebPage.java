package com.project.clon.entities;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import javax.persistence.*;

@Entity
@Table(name="webpage")
@ToString
@Getter
public class WebPage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "url")
    private String url;
    @Column(name = "title")
    private String title;
    @Column(name = "description")
    private String description;


    public static final class WebPageBuilder {
        private Long id;
        private String url;
        private String title;
        private String description;

        private WebPageBuilder() {
        }

        @Contract(value = " -> new", pure = true)
        public static @NotNull WebPageBuilder aWebPage() {
            return new WebPageBuilder();
        }

        public WebPageBuilder witId(Long id) {
            this.id = id;
            return this;
        }

        public WebPageBuilder withUrl(String url) {
            this.url = url;
            return this;
        }

        public WebPageBuilder withTitle(String title) {
            this.title = title;
            return this;
        }

        public WebPageBuilder withDescription(String description) {
            this.description = description;
            return this;
        }

        public WebPage build() {
            WebPage webPage = new WebPage();
            webPage.id = this.id;
            webPage.url = this.url;
            webPage.title = this.title;
            webPage.description = this.description;
            return webPage;
        }
    }
}
