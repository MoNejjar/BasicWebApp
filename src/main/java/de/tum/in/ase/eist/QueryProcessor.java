package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

@Service
public class QueryProcessor {

    public String process(String query) {
        query = query.toLowerCase();
        if (query.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.contains("name")) {
            return "MyTeam";
        } else if (query.contains("hello")) {
            return "hi :)";
        } else if (query.contains("how are you?")) {
            return "i'm fine :)";
        } else if (query.contains("what's your name?")) {
            return "I am thee ancient one";
        }

        else return"";
    }
}
