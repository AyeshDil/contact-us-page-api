package com.myproject.contactus.contactuspage.util;

public class HtmlContent {
    public String content(){
        return "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>Thank you</title>\n" +
                "\n" +
                "    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD\" crossorigin=\"anonymous\">\n" +
                "\n" +
                "    <style>\n" +
                "        *{\n" +
                "            box-sizing:border-box;\n" +
                "        }\n" +
                "        body{\n" +
                "            /*background: #2c3e50;*/\n" +
                "            height: 100%;\n" +
                "            margin: 0;\n" +
                "            background-repeat: no-repeat;\n" +
                "            background-attachment: fixed;\n" +
                "\n" +
                "        }\n" +
                "        a {\n" +
                "            color: black;\n" +
                "            text-decoration: none;\n" +
                "            transition: all 0.30s linear 0s;\n" +
                "        }\n" +
                "\n" +
                "        .wrapper-1{\n" +
                "            width:100%;\n" +
                "            height:100vh;\n" +
                "            display: flex;\n" +
                "            flex-direction: column;\n" +
                "        }\n" +
                "        .wrapper-2{\n" +
                "            padding: 30px;\n" +
                "            text-align:center;\n" +
                "        }\n" +
                "        h1{\n" +
                "            font-family: 'Raleway', Arial Black, Sans-Serif;\n" +
                "            font-size:4em;\n" +
                "            font-weight: 900;\n" +
                "            letter-spacing:3px;\n" +
                "            color: #000;\n" +
                "            margin:0;\n" +
                "            margin-top: 40px;\n" +
                "            margin-bottom:40px;\n" +
                "        }\n" +
                "        .wrapper-2 p{\n" +
                "            margin:0;\n" +
                "            font-size:1.3em;\n" +
                "            color:#000;\n" +
                "            font-family: 'Raleway', sans-serif;\n" +
                "            letter-spacing:1px;\n" +
                "            line-height: 1.5;\n" +
                "        }\n" +
                "        .go-home{\n" +
                "            background: #27ae60;\n" +
                "            border:none;\n" +
                "            padding: 25px 30px;\n" +
                "            margin: 30px 0;\n" +
                "            border-radius: 5px;\n" +
                "            cursor: pointer;\n" +
                "        }\n" +
                "        .go-home:hover{\n" +
                "            opacity: 0.9;\n" +
                "        }\n" +
                "        .go-home a{\n" +
                "            font-family: 'Raleway', Arial Black;\n" +
                "            font-size: 1rem;\n" +
                "            font-weight: 700!important;\n" +
                "            text-transform: uppercase;\n" +
                "            letter-spacing: 2px;\n" +
                "\n" +
                "        }\n" +
                "\n" +
                "        @media (min-width:360px){\n" +
                "            h1{\n" +
                "                font-size:4.5em;\n" +
                "            }\n" +
                "            .go-home{\n" +
                "                margin-bottom:20px;\n" +
                "            }\n" +
                "        }\n" +
                "\n" +
                "        @media (min-width:600px){\n" +
                "            .main-outer{\n" +
                "                max-width:1000px;\n" +
                "                margin:0 auto;\n" +
                "            }\n" +
                "            .wrapper-1{\n" +
                "                height: initial;\n" +
                "                max-width:620px;\n" +
                "                margin:0 auto;\n" +
                "                margin-top:50px;\n" +
                "            }\n" +
                "\n" +
                "        }\n" +
                "    </style>\n" +
                "\n" +
                "</head>\n" +
                "<body>\n" +
                "\n" +
                "<div class=\"main-outer\">\n" +
                "    <div class=\"wrapper-1\">\n" +
                "        <div class=\"wrapper-2\">\n" +
                "                <h1>Thank you!</h1>\n" +
                "            <p>for contacting us, we will reply promptly</p>\n" +
                "            <p>once your message is received. </p>\n" +
                "            <button class=\"go-home\"><a href=\"https://github.com/AyeshDil\">\n" +
                "                home page</a>\n" +
                "            </button>\n" +
                "        </div>\n" +
                "\n" +
                "    </div>\n" +
                "</div>\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "</body>\n" +
                "</html>";

    }
}
