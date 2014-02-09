package bing.praser;

import bing.*;
import org.htmlparser.*;

public class UrlPraser{
	   private String getNewsContent(NodeFilter newsContentFilter, Parser parser) {
	        String content = null;
	        StringBuilder builder = new StringBuilder();


	        try {
	            parser.setEncoding("utf-8");
	            NodeList newsContentList = (NodeList) parser.parse(newsContentFilter);
	            BodyTag newsContenTag = (BodyTag) newsContentList.elementAt(0);
	            builder = builder.append(newsContenTag.getStringText());
	            
	            content = builder.toString();  //转换为String 类型。
	            if (content != null) {
	                parser.reset();

	                parser = Parser.createParser(content, "utf-8");
	                StringBean sb = new StringBean();
	                sb.setCollapse(true);
	                parser.visitAllNodesWith(sb);
	                content = sb.getStrings();


	            } else {
	               //System.out.println("no content!");
	            }

	        } catch (ParserException ex) {
	            //Logger.getLogger(ParsePage.class.getName()).log(Level.SEVERE, null, ex);
	        }

	        return content;
	    }
	
	
    public String parser(String url) {
        try {
            parser = new Parser(url);
            NodeFilter contentFilter= new TagNameFilter("body");
            
            String newsTitle = getTitle(titleFilter, parser);
            parser.reset();   //reset praser after every prasering!
            String newsContent = getNewsContent(contentFilter, parser);

            return newsContent;
            
        } catch (ParserException ex) {
           // Logger.getLogger(ParsePage.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (NullPointerException e){
            
        }
    }
    
    
    public static void main(String[] args){
    	UrlPraser praser = new UrlPraser();
    	System.out.println(praser.parser("http://en.wikipedia.org/wiki/Bill_Gates"));
    }
}