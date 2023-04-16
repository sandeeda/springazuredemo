package com.sandeep.spring.azure.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringAzureDemoApplication {

	@GetMapping("/message")
	public String message() {
	    String htmlContent = "<html><body><h1>Congrats</h1><p>You have successfully deployed your Spring Boot application to Azure.</p></body></html>";
	    return htmlContent;
	}

	@GetMapping("/")
	public String calculateTax() {
	    String htmlContent = "<html>\n" +
                "<head>\n" +
                "<title>Tax Calculator</title>\n" +
                "<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.6.0/css/bootstrap.min.css\">\n" +
                "</head>\n" +
                "<body>\n" +
                "<div class=\"container mt-5\">\n" +
                "<h1>Tax Calculator</h1>\n" +
                "<form>\n" +
                "<div class=\"form-group\">\n" +
                "<label for=\"income\">Income:</label>\n" +
                "<input type=\"number\" class=\"form-control\" id=\"income\" name=\"income\" required>\n" +
                "</div>\n" +
                "<div class=\"form-group\">\n" +
                "<label for=\"taxRate\">Tax Rate:</label>\n" +
                "<input type=\"number\" class=\"form-control\" id=\"taxRate\" name=\"taxRate\" required>\n" +
                "</div>\n" +
                "<button type=\"button\" class=\"btn btn-primary mr-2\" onclick=\"calculateTax()\">Calculate Tax</button>\n" +
                "<button type=\"button\" class=\"btn btn-secondary\" onclick=\"resetForm()\">Reset</button>\n" +
                "</form>\n" +
                "<div id=\"result\" class=\"mt-3\"></div>\n" +
                "</div>\n" +
                "<script>\n" +
                "function calculateTax() {\n" +
                "    var income = document.getElementById('income').value;\n" +
                "    var taxRate = document.getElementById('taxRate').value;\n" +
                "    var tax = income * (taxRate / 100);\n" +
                "    var result = document.getElementById('result');\n" +
                "    result.innerHTML = '<p>Tax: $' + tax.toFixed(2) + '</p>';\n" +
                "}\n" +
                "function resetForm() {\n" +
                "    document.getElementById('income').value = '';\n" +
                "    document.getElementById('taxRate').value = '';\n" +
                "    document.getElementById('result').innerHTML = '';\n" +
                "}\n" +
                "</script>\n" +
                "</body>\n" +
                "</html>";
	    return htmlContent;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringAzureDemoApplication.class, args);
	}

}
