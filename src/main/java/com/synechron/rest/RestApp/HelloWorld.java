package com.synechron.rest.RestApp;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloWorld {
	@RequestMapping("/")
	public String index() {
		return "Hello World!";
	}

	@RequestMapping(value = "/cat", method = RequestMethod.GET)
	public String cat() {
		return "cat!";
	}
	
	
	@RequestMapping(value = "/isbn", method = RequestMethod.GET)
	public String dog() {
		return "bark!";
	}
	
	
	@RequestMapping(value = "/search", method = RequestMethod.GET, produces = { "application/xml", "text/xml" }, consumes = MediaType.ALL_VALUE )
    @ResponseBody
    public String search() {
     
        
        return "<StockEnquiry version=\"1.1\">\n" + 
        		"    \n" + 
        		"    <Header>\n" + 
        		"        \n" + 
        		"        <StockEnquiryNumber>\n" + 
        		"            0001\n" + 
        		"        </StockEnquiryNumber>\n" + 
        		"        <IssueDateTime>\n" + 
        		"            20091217\n" + 
        		"        </IssueDateTime>\n" + 
        		"        <PurposeCode>\n" + 
        		"            Original\n" + 
        		"        </PurposeCode>\n" + 
        		"        \n" + 
        		"        <BuyerParty>\n" + 
        		"            <PartyID>\n" + 
        		"                <PartyIDType>\n" + 
        		"                    SAN\n" + 
        		"                </PartyIDType>\n" + 
        		"                <Identifier>\n" + 
        		"                    2015726\n" + 
        		"                </Identifier>\n" + 
        		"            </PartyID>\n" + 
        		"            <PartyName>\n" + 
        		"                <NameLine>\n" + 
        		"                    The Test Store\n" + 
        		"                </NameLine>\n" + 
        		"            </PartyName>\n" + 
        		"        </BuyerParty>\n" + 
        		"        \n" + 
        		"        <SourceParty>\n" + 
        		"            <PartyID>\n" + 
        		"                <PartyIDType>\n" + 
        		"                    SAN\n" + 
        		"                </PartyIDType>\n" + 
        		"                <Identifier>\n" + 
        		"                    1697978\n" + 
        		"                </Identifier>\n" + 
        		"            </PartyID>\n" + 
        		"            <PartyName>\n" + 
        		"                <NameLine>\n" + 
        		"                    Ingram Book Co.\n" + 
        		"                </NameLine>\n" + 
        		"            </PartyName>\n" + 
        		"        </SourceParty>\n" + 
        		"        \n" + 
        		"        <SupplierParty>\n" + 
        		"            <PartyID>\n" + 
        		"                <PartyIDType>\n" + 
        		"                    SAN\n" + 
        		"                </PartyIDType>\n" + 
        		"                <Identifier>\n" + 
        		"                    1697978\n" + 
        		"                </Identifier>\n" + 
        		"            </PartyID>\n" + 
        		"            <PartyName>\n" + 
        		"                <NameLine>\n" + 
        		"                    Ingram Book Co.\n" + 
        		"                </NameLine>\n" + 
        		"            </PartyName>\n" + 
        		"        </SupplierParty>\n" + 
        		"        \n" + 
        		"        <StockQuantityType>\n" + 
        		"            OnHand\n" + 
        		"        </StockQuantityType>\n" + 
        		"        <StockQuantityType>\n" + 
        		"            OnOrder\n" + 
        		"        </StockQuantityType>\n" + 
        		"        <StockQuantityType>\n" + 
        		"            CBO\n" + 
        		"        </StockQuantityType>\n" + 
        		"        <Include>\n" + 
        		"            Biblio\n" + 
        		"        </Include>\n" + 
        		"    </Header>\n" + 
        		"    \n" + 
        		"    <RequestDetail>\n" + 
        		"        <LineNumber>\n" + 
        		"            1\n" + 
        		"        </LineNumber>\n" + 
        		"        <ProductID>\n" + 
        		"            <ProductIDType>\n" + 
        		"                ISBN\n" + 
        		"            </ProductIDType>\n" + 
        		"            <Identifier>\n" + 
        		"                0053939613926\n" + 
        		"            </Identifier>\n" + 
        		"        </ProductID>\n" + 
        		"    </RequestDetail>\n" + 
        		"    \n" + 
        		"    <Summary>\n" + 
        		"        <NumberOfLines>\n" + 
        		"            1\n" + 
        		"        </NumberOfLines>\n" + 
        		"    </Summary>\n" + 
        		"    \n" + 
        		"</StockEnquiry>\n" + 
        		"";
    }
	
}
