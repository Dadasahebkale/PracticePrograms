package com.basicauth;

import java.net.URI;
import java.util.function.Predicate;

import org.openqa.selenium.HasAuthentication;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BasicAuthentication {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.setBrowserVersion("118");
        //options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver=new ChromeDriver(options);
        Predicate<URI> uriPredicate= uri -> uri.getHost().contains("httpbin.org");
        ((HasAuthentication)driver)
                .register(uriPredicate, UsernameAndPassword.of("foo","bar"));

        driver.get("http://httpbin.org/basic-auth/foo/bar");

	}

}
