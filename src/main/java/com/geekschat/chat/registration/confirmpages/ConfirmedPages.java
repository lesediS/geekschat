package com.geekschat.chat.registration.confirmpages;

import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfirmedPages {

    // shown when token has expired
    //https://codepen.io/warrendunlop/pen/YmVKzm
    public String tokenExprired() {
        return "<style>\r\n" + //
                "      body {\r\n" + //
                "        text-align: center;\r\n" + //
                "        padding: 40px 0;\r\n" + //
                "        background: #EBF0F5;\r\n" + //
                "      }\r\n" + //
                "        h1 {\r\n" + //
                "          color: #ff440b;\r\n" + //
                "          font-family: \"Nunito Sans\", \"Helvetica Neue\", sans-serif;\r\n" + //
                "          font-weight: 900;\r\n" + //
                "          font-size: 40px;\r\n" + //
                "          margin-bottom: 10px;\r\n" + //
                "        }\r\n" + //
                "        p {\r\n" + //
                "          color: #404F5E;\r\n" + //
                "          font-family: \"Nunito Sans\", \"Helvetica Neue\", sans-serif;\r\n" + //
                "          font-size:20px;\r\n" + //
                "          margin: 0;\r\n" + //
                "        }\r\n" + //
                "      i {\r\n" + //
                "        color: #f4512c;\r\n" + //
                "        font-size: 100px;\r\n" + //
                "        line-height: 200px;\r\n" + //
                "        margin-left:-15px;\r\n" + //
                "      }\r\n" + //
                "      .card {\r\n" + //
                "        background: white;\r\n" + //
                "        padding: 60px;\r\n" + //
                "        border-radius: 4px;\r\n" + //
                "        box-shadow: 0 2px 3px #C8D0D8;\r\n" + //
                "        display: inline-block;\r\n" + //
                "        margin: 0 auto;\r\n" + //
                "      }\r\n" + //
                "    </style>\r\n" + //
                "    <body>\r\n" + //
                "      <div class=\"card\">\r\n" + //
                "      <div style=\"border-radius:200px; height:200px; width:200px; background: #F8FAF5; margin:0 auto;\">\r\n"
                +
                "        <i class=\"cross\">:(</i>\r\n" + //
                "      </div>\r\n" + //
                "        <h1>Oops</h1> \r\n" + //
                "        <p>Link expired</p>\r\n" + //
                "      </div>\r\n" + //
                "    </body>";
    }

    public String mailExists() {
        return "<style>\r\n" + //
                "      body {\r\n" + //
                "        text-align: center;\r\n" + //
                "        padding: 40px 0;\r\n" + //
                "        background: #EBF0F5;\r\n" + //
                "      }\r\n" + //
                "        h1 {\r\n" + //
                "          color: #ff440b;\r\n" + //
                "          font-family: \"Nunito Sans\", \"Helvetica Neue\", sans-serif;\r\n" + //
                "          font-weight: 900;\r\n" + //
                "          font-size: 40px;\r\n" + //
                "          margin-bottom: 10px;\r\n" + //
                "        }\r\n" + //
                "        p {\r\n" + //
                "          color: #404F5E;\r\n" + //
                "          font-family: \"Nunito Sans\", \"Helvetica Neue\", sans-serif;\r\n" + //
                "          font-size:20px;\r\n" + //
                "          margin: 0;\r\n" + //
                "        }\r\n" + //
                "      i {\r\n" + //
                "        color: #f4512c;\r\n" + //
                "        font-size: 100px;\r\n" + //
                "        line-height: 200px;\r\n" + //
                "        margin-left:-15px;\r\n" + //
                "      }\r\n" + //
                "      .card {\r\n" + //
                "        background: white;\r\n" + //
                "        padding: 60px;\r\n" + //
                "        border-radius: 4px;\r\n" + //
                "        box-shadow: 0 2px 3px #C8D0D8;\r\n" + //
                "        display: inline-block;\r\n" + //
                "        margin: 0 auto;\r\n" + //
                "      }\r\n" + //
                "    </style>\r\n" + //
                "    <body>\r\n" + //
                "      <div class=\"card\">\r\n" + //
                "      <div style=\"border-radius:200px; height:200px; width:200px; background: #F8FAF5; margin:0 auto;\">\r\n"
                +
                "        <i class=\"cross\">x</i>\r\n" + //
                "      </div>\r\n" + //
                "        <h1>Oops</h1> \r\n" + //
                "        <p>Email already confirmed</p>\r\n" + //
                "      </div>\r\n" + //
                "    </body>";
    }

    public String buildEmailConfirm() {
        return "<style>\r\n" +
                "      body {\r\n" +
                "        text-align: center;\r\n" +
                "        padding: 40px 0;\r\n" +
                "        background: #EBF0F5;\r\n" +
                "      }\r\n" + //
                "        h1 {\r\n" + //
                "          color: #88B04B;\r\n" + //
                "          font-family: \"Nunito Sans\", \"Helvetica Neue\", sans-serif;\r\n" + //
                "          font-weight: 900;\r\n" + //
                "          font-size: 40px;\r\n" + //
                "          margin-bottom: 10px;\r\n" + //
                "        }\r\n" + //
                "        p {\r\n" + //
                "          color: #404F5E;\r\n" + //
                "          font-family: \"Nunito Sans\", \"Helvetica Neue\", sans-serif;\r\n" + //
                "          font-size:20px;\r\n" + //
                "          margin: 0;\r\n" + //
                "        }\r\n" + //
                "      i {\r\n" + //
                "        color: #9ABC66;\r\n" + //
                "        font-size: 100px;\r\n" + //
                "        line-height: 200px;\r\n" + //
                "        margin-left:-15px;\r\n" + //
                "      }\r\n" + //
                "      .card {\r\n" + //
                "        background: white;\r\n" + //
                "        padding: 60px;\r\n" + //
                "        border-radius: 4px;\r\n" + //
                "        box-shadow: 0 2px 3px #C8D0D8;\r\n" + //
                "        display: inline-block;\r\n" + //
                "        margin: 0 auto;\r\n" + //
                "      }\r\n" + //
                "    </style>\r\n" + //
                "    <body>\r\n" + //
                "      <div class=\"card\">\r\n" + //
                "      <div style=\"border-radius:200px; height:200px; width:200px; background: #F8FAF5; margin:0 auto;\">\r\n"
                + //
                "        <i class=\"checkmark\">✓</i>\r\n" + //
                "      </div>\r\n" + //
                "        <h1>Success</h1> \r\n" + //
                "        <p>You're all set!</p>\r\n" + //
                "      </div>\r\n" + //
                "    </body>";
    }

    // https://youtu.be/QwQuro7ekvc?si=ord9Xv_ZvOVZ7Ddl
    public String buildEmail(String name, String link) {
        return "<div style=\"font-family:Helvetica,Arial,sans-serif;font-size:16px;margin:0;color:#0b0c0c\">\n" +
                "\n" +
                "<span style=\"display:none;font-size:1px;color:#fff;max-height:0\"></span>\n" +
                "\n" +
                "  <table role=\"presentation\" width=\"100%\" style=\"border-collapse:collapse;min-width:100%;width:100%!important\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\">\n"
                +
                "    <tbody><tr>\n" +
                "      <td width=\"100%\" height=\"53\" bgcolor=\"#0b0c0c\">\n" +
                "        \n" +
                "        <table role=\"presentation\" width=\"100%\" style=\"border-collapse:collapse;max-width:580px\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\" align=\"center\">\n"
                +
                "          <tbody><tr>\n" +
                "            <td width=\"70\" bgcolor=\"#0b0c0c\" valign=\"middle\">\n" +
                "                <table role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"border-collapse:collapse\">\n"
                +
                "                  <tbody><tr>\n" +
                "                    <td style=\"padding-left:10px\">\n" +
                "                  \n" +
                "                    </td>\n" +
                "                    <td style=\"font-size:28px;line-height:1.315789474;Margin-top:4px;padding-left:10px\">\n"
                +
                "                      <span style=\"font-family:Helvetica,Arial,sans-serif;font-weight:700;color:#ffffff;text-decoration:none;vertical-align:top;display:inline-block\">Confirm your email</span>\n"
                +
                "                    </td>\n" +
                "                  </tr>\n" +
                "                </tbody></table>\n" +
                "              </a>\n" +
                "            </td>\n" +
                "          </tr>\n" +
                "        </tbody></table>\n" +
                "        \n" +
                "      </td>\n" +
                "    </tr>\n" +
                "  </tbody></table>\n" +
                "  <table role=\"presentation\" class=\"m_-6186904992287805515content\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"border-collapse:collapse;max-width:580px;width:100%!important\" width=\"100%\">\n"
                +
                "    <tbody><tr>\n" +
                "      <td width=\"10\" height=\"10\" valign=\"middle\"></td>\n" +
                "      <td>\n" +
                "        \n" +
                "                <table role=\"presentation\" width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"border-collapse:collapse\">\n"
                +
                "                  <tbody><tr>\n" +
                "                    <td bgcolor=\"#1D70B8\" width=\"100%\" height=\"10\"></td>\n" +
                "                  </tr>\n" +
                "                </tbody></table>\n" +
                "        \n" +
                "      </td>\n" +
                "      <td width=\"10\" valign=\"middle\" height=\"10\"></td>\n" +
                "    </tr>\n" +
                "  </tbody></table>\n" +
                "\n" +
                "\n" +
                "\n" +
                "  <table role=\"presentation\" class=\"m_-6186904992287805515content\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"border-collapse:collapse;max-width:580px;width:100%!important\" width=\"100%\">\n"
                +
                "    <tbody><tr>\n" +
                "      <td height=\"30\"><br></td>\n" +
                "    </tr>\n" +
                "    <tr>\n" +
                "      <td width=\"10\" valign=\"middle\"><br></td>\n" +
                "      <td style=\"font-family:Helvetica,Arial,sans-serif;font-size:19px;line-height:1.315789474;max-width:560px\">\n"
                +
                "        \n" + // The email body
                "            <p style=\"Margin:0 0 20px 0;font-size:19px;line-height:25px;color:#0b0c0c\">Hi " + name
                + ",</p><p style=\"Margin:0 0 20px 0;font-size:19px;line-height:25px;color:#0b0c0c\"> Thank you for registering. Please click on the below link to activate your account: </p><blockquote style=\"Margin:0 0 20px 0;border-left:10px solid #b1b4b6;padding:15px 0 0.1px 15px;font-size:19px;line-height:25px\"><p style=\"Margin:0 0 20px 0;font-size:19px;line-height:25px;color:#0b0c0c\"> <a href=\""
                + link
                + "\">Activate Now</a> </p></blockquote>\n Link will expire in 15 minutes. <p>Happy chatting!</p>" +
                "        \n" +
                "      </td>\n" +
                "      <td width=\"10\" valign=\"middle\"><br></td>\n" +
                "    </tr>\n" +
                "    <tr>\n" +
                "      <td height=\"30\"><br></td>\n" +
                "    </tr>\n" +
                "  </tbody></table><div class=\"yj6qo\"></div><div class=\"adL\">\n" +
                "\n" +
                "</div></div>";
    }

}
