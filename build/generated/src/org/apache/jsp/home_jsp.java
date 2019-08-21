package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>HOME</title>\r\n");
      out.write("      \r\n");
      out.write("         <link rel=\"stylesheet\" href=\"m_style.css\">\r\n");
      out.write("          <link rel=\"stylesheet\" href=\"owl.carousel.min.css\">\r\n");
      out.write("           <link rel=\"stylesheet\" href=\"newcss.css\">\r\n");
      out.write("         \r\n");
      out.write("        <script src=\"https://kit.fontawesome.com/46cd94557b.js\"></script>\r\n");
      out.write("         \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"topbar\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"topleft\">\r\n");
      out.write("                    <ul>\r\n");
      out.write("                        <li><a href=\"#\">EN<i class=\"fas fa-caret-down\"></i></a>\r\n");
      out.write("                               <ul>\r\n");
      out.write("                                   <li><a href=\"#\">RU</a></li>\r\n");
      out.write("                               <li><a href=\"#\">EN</a></li>\r\n");
      out.write("                               <li><a href=\"#\">FR</a></li>\r\n");
      out.write("                               <li><a href=\"#\">AU</a></li>\r\n");
      out.write("                             </ul>\r\n");
      out.write("                                \r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li><a href=\"#\">USD<i class=\"fas fa-caret-down\"></i></a>\r\n");
      out.write("                            <ul>\r\n");
      out.write("                                <li><a href=\"#\">AUS</a></li>\r\n");
      out.write("                                <li><a href=\"#\">YEN</a></li>\r\n");
      out.write("                                <li><a href=\"#\">INR</a></li>\r\n");
      out.write("                            </ul>        \r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"topcenter\">\r\n");
      out.write("                    <ul>\r\n");
      out.write("                        <li><a href=\"#\">Home</a> </li>\r\n");
      out.write("                        <li><a href=\"#\">Store Profile</a> </li>\r\n");
      out.write("                        <li><a href=\"#\">Payment</a> </li>\r\n");
      out.write("                        <li><a href=\"#\">Delivery</a> </li>\r\n");
      out.write("                        <li><a href=\"#\">Contact Us</a> </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"topright\">\r\n");
      out.write("                    <ul>\r\n");
      out.write("                        <li><a href=\"#\"><i class=\"fas fa-phone\"></i>+916375422034</a></li>\r\n");
      out.write("                        <li><a href=\"#\"><i class=\"fas fa-user\"></i> My Profile<i class=\"fas fa-caret-down\"></i></a>\r\n");
      out.write("                            <ul class=\"myprofile-dropdown\">\r\n");
      out.write("                                <li><a href=\"#\">My Order</a></li>\r\n");
      out.write("                                <li><a href=\"#\">My Wishlist</a></li>\r\n");
      out.write("                                <li><a href=\"#\">Pending List</a></li>\r\n");
      out.write("                                <li><a href=\"#\">Delivered Order</a></li>\r\n");
      out.write("                            </ul>    \r\n");
      out.write("                       </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("              </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("            \r\n");
      out.write("            <div class=\"header\">\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <div class=\"logo\">\r\n");
      out.write("                        <img src=\"images/log.png\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"search\">\r\n");
      out.write("                        <form>\r\n");
      out.write("                            <input type=\"search\" class=\"searchField\" placeholder=\"Search for books\">\r\n");
      out.write("                        </form>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"headerright\">\r\n");
      out.write("                        <ul>\r\n");
      out.write("                            <li><a href=\"#\"><i class=\"fas fa-heart\"></i>Wishlist</a></li>\r\n");
      out.write("                            <li><a href=\"#\"><i class=\"fas fa-shopping-cart\"></i>Cart</a></li>\r\n");
      out.write("                            <li><a href=\"#\" class=\"signbtn\">Login & Register</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        \r\n");
      out.write("        <div class=\"productContent\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"productCategories\">\r\n");
      out.write("                    <ul>\r\n");
      out.write("                        <li><a href=\"#\">Electronics<i class=\"fas fa-caret-right\"></i></a>\r\n");
      out.write("                            <div class=\"megamenu\">\r\n");
      out.write("                               \r\n");
      out.write("                                    <ul>\r\n");
      out.write("                                    <h3>Mobiles<i class=\"fas fa-caret-right\"></i></h3>\r\n");
      out.write("                                    <li> <a href=\"#\">Samsung</a></li>\r\n");
      out.write("                                    <li> <a href=\"#\">Apple</a></li>\r\n");
      out.write("                                    <li> <a href=\"#\">OnePlus</a></li>\r\n");
      out.write("                                    <li> <a href=\"#\">Redmi</a></li>\r\n");
      out.write("                                    <li> <a href=\"#\">Vivo</a></li>\r\n");
      out.write("                                    <li> <a href=\"#\">Oppo</a></li>\r\n");
      out.write("                                    <li> <a href=\"#\">Sony</a></li>\r\n");
      out.write("                                    <li> <a href=\"#\">BlackBerry</a></li>\r\n");
      out.write("                                    <li> <a href=\"#\">LG</a></li>   \r\n");
      out.write("                                    </ul>\r\n");
      out.write("                                 <ul>\r\n");
      out.write("                                    <h3>Digital Camera<i class=\"fas fa-caret-right\"></i></h3>\r\n");
      out.write("                                    <li> <a href=\"#\">Canon</a></li>\r\n");
      out.write("                                    <li> <a href=\"#\">Nikon</a></li>\r\n");
      out.write("                                    <li> <a href=\"#\">Sony</a></li>\r\n");
      out.write("                                    <li> <a href=\"#\">Olympus</a></li>\r\n");
      out.write("                                    <li> <a href=\"#\">Casio</a></li>\r\n");
      out.write("                                    <li> <a href=\"#\">Panasonic</a></li>\r\n");
      out.write("                                    <li> <a href=\"#\">Lumix</a></li>\r\n");
      out.write("                                    <li> <a href=\"#\">Kodak</a></li>\r\n");
      out.write("                                    <li> <a href=\"#\">Samsung</a></li>   \r\n");
      out.write("                                    </ul>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        \r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li><a href=\"#\">TV & Multimedia<i class=\"fas fa-caret-right\"></i></a>\r\n");
      out.write("                            <div class=\"megamenu\">\r\n");
      out.write("                                <ul>\r\n");
      out.write("                                    <h3>Television<i class=\"fas fa-caret-right\"></i></h3>\r\n");
      out.write("                                    <li> <a href=\"#\">Hisense</a></li>\r\n");
      out.write("                                    <li> <a href=\"#\">Insignia</a></li>\r\n");
      out.write("                                    <li> <a href=\"#\">LG</a></li>\r\n");
      out.write("                                    <li> <a href=\"#\">Samsung</a></li>\r\n");
      out.write("                                    <li> <a href=\"#\">Sharp</a></li>\r\n");
      out.write("                                    <li> <a href=\"#\">Sony</a></li>\r\n");
      out.write("                                    <li> <a href=\"#\">TCL</a></li>\r\n");
      out.write("                                    <li> <a href=\"#\">Onida</a></li>\r\n");
      out.write("                                    <li> <a href=\"#\">VU</a></li>\r\n");
      out.write("                                    \r\n");
      out.write("                                   \r\n");
      out.write("                                </ul>\r\n");
      out.write("                                 <ul>\r\n");
      out.write("                                    <h3>Washing Machine<i class=\"fas fa-caret-right\"></i></h3>\r\n");
      out.write("                                    <li> <a href=\"#\">Whirlpool</a></li>\r\n");
      out.write("                                    <li> <a href=\"#\">GE(US)</a></li>\r\n");
      out.write("                                    <li> <a href=\"#\">LG</a></li>\r\n");
      out.write("                                    <li> <a href=\"#\">Electrolux</a></li>\r\n");
      out.write("                                    <li> <a href=\"#\">Samsung</a></li>\r\n");
      out.write("                                    <li> <a href=\"#\">Haier</a></li>\r\n");
      out.write("                                    <li> <a href=\"#\">Godrej</a></li>\r\n");
      out.write("                                    <li> <a href=\"#\">Midea</a></li>\r\n");
      out.write("                                   \r\n");
      out.write("                                </ul>\r\n");
      out.write("                                     <ul>\r\n");
      out.write("                                    <h3>MicroWave<i class=\"fas fa-caret-right\"></i></h3>\r\n");
      out.write("                                       <li> <a href=\"#\">IFB</a></li>\r\n");
      out.write("                                    <li> <a href=\"#\">Bajaj</a></li>\r\n");
      out.write("                                    <li> <a href=\"#\">LG</a></li>\r\n");
      out.write("                                    <li> <a href=\"#\">Panasonic</a></li>\r\n");
      out.write("                                    <li> <a href=\"#\">Samsung</a></li>\r\n");
      out.write("                                    <li> <a href=\"#\">Whirlpool</a></li>\r\n");
      out.write("                                    <li> <a href=\"#\">Godrej</a></li>\r\n");
      out.write("                                    <li> <a href=\"#\">Morphy</a></li>\r\n");
      out.write("                                   \r\n");
      out.write("                                   \r\n");
      out.write("                                  </ul>\r\n");
      out.write("                                \r\n");
      out.write("                            </div>  \r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li><a href=\"#\">Sports & Books<i class=\"fas fa-caret-right\"></i></a>\r\n");
      out.write("                            <div class=\"megamenu\">\r\n");
      out.write("                                <ul>\r\n");
      out.write("                                    <h3>Finance<i class=\"fas fa-caret-right\"></i></h3>\r\n");
      out.write("                                    <li> <a href=\"#\">The Millionaire</a></li>\r\n");
      out.write("                                    <li> <a href=\"#\">Rich Dad Poor Dad</a></li>\r\n");
      out.write("                                    <li> <a href=\"#\">The Intelligent Invester</a></li>\r\n");
      out.write("                                    <li> <a href=\"#\">Your Money r=or Your Life</a></li>\r\n");
      out.write("                                   \r\n");
      out.write("                                </ul>\r\n");
      out.write("                                    <ul>\r\n");
      out.write("                                    <h3>Economics<i class=\"fas fa-caret-right\"></i></h3>\r\n");
      out.write("                                    <li> <a href=\"#\">The Wealth Of Nation</a></li>\r\n");
      out.write("                                    <li> <a href=\"#\">Freak</a></li>\r\n");
      out.write("                                    <li> <a href=\"#\">Why Nation Fail</a></li>\r\n");
      out.write("                                    <li> <a href=\"#\">Capital</a></li>\r\n");
      out.write("                                   \r\n");
      out.write("                                    </ul>\r\n");
      out.write("                                 <ul>\r\n");
      out.write("                                    <h3>Industries<i class=\"fas fa-caret-right\"></i></h3>\r\n");
      out.write("                                    <li> <a href=\"#\">The Industries</a></li>\r\n");
      out.write("                                    <li> <a href=\"#\">Why I Stopped Wearing</a></li>\r\n");
      out.write("                                    <li> <a href=\"#\">Profitable Plastic</a></li>\r\n");
      out.write("                                    <li> <a href=\"#\">To Die For</a></li>\r\n");
      out.write("                                   \r\n");
      out.write("                               </ul>\r\n");
      out.write("                            </div>  \r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li><a href=\"#\">Tools & Hardware<i class=\"fas fa-caret-right\"></i></a></li>\r\n");
      out.write("                        <li><a href=\"#\">Clothes<i class=\"fas fa-caret-right\"></i></a></li>\r\n");
      out.write("                        <li><a href=\"#\">Flowers<i class=\"fas fa-caret-right\"></i></a></li>\r\n");
      out.write("                        <li><a href=\"#\">Accessories<i class=\"fas fa-caret-right\"></i></a></li>\r\n");
      out.write("                        <li><a href=\"#\">Car Appliance<i class=\"fas fa-caret-right\"></i></a></li>\r\n");
      out.write("                        <li><a href=\"#\">Outdoors<i class=\"fas fa-caret-right\"></i></a></li>\r\n");
      out.write("                        <li><a href=\"#\">Home Appliance<i class=\"fas fa-caret-right\"></i></a></li>\r\n");
      out.write("                        <li><a href=\"#\">Health Products<i class=\"fas fa-caret-right\"></i></a></li>\r\n");
      out.write("                        <li><a href=\"#\">Beauty Products<i class=\"fas fa-caret-right\"></i></a></li>\r\n");
      out.write("                        <li><a href=\"#\">Baby & Kids<i class=\"fas fa-caret-right\"></i></a></li>\r\n");
      out.write("                        \r\n");
      out.write("                        \r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("               \r\n");
      out.write("                <div class=\"productSlider\">\r\n");
      out.write("                    <div id=\"slidershuffle\" class=\"sliderInner\">\r\n");
      out.write("                    <img src=\"images/m_1.jpg\">\r\n");
      out.write("                    <img src=\"images/m_2.jpg\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                       <div class=\"cycle-control\">\r\n");
      out.write("                        <span id=\"next\" <i class=\"fas fa-angle-right\"></i></span>\r\n");
      out.write("                        <span id=\"prev\" <i class=\"fas fa-angle-left\"></i></span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                </div> \r\n");
      out.write("                    <div class=\"offer-card\">\r\n");
      out.write("                        <img src=\"images/img1.jpg\">\r\n");
      out.write("                    \r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"offer-card\">\r\n");
      out.write("                         <img src=\"images/img2.jpg\">\r\n");
      out.write("                    \r\n");
      out.write("                    </div>\r\n");
      out.write("                     <div class=\"offer-card\">\r\n");
      out.write("                         <img src=\"images/img3.jpg\">\r\n");
      out.write("                    \r\n");
      out.write("                     </div>\r\n");
      out.write("                    \r\n");
      out.write("                \r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        \r\n");
      out.write("        <div class=\"banner\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <img src=\"images/ban.jpg\" alt=\"Banner\">\r\n");
      out.write("            </div>    \r\n");
      out.write("        </div> \r\n");
      out.write("        \r\n");
      out.write("        <div class=\"product-area\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <h3>Top Selling Products</h3>\r\n");
      out.write("                <div class=\"col-3\">\r\n");
      out.write("                  <a href=\"#\">\r\n");
      out.write("                      <img src=\"images/product-img1.jpg\" alt=\"\">\r\n");
      out.write("                      <div class=\"caption\">\r\n");
      out.write("                          <big>Code : GA00006488 </big>\r\n");
      out.write("                          <h4>Applie MacBook Air MQ032 14.5 Intel Core i5\r\n");
      out.write("                          5550U 8GB DDR3</h4>\r\n");
      out.write("                          <button class=\"price\"><i class=\"fas fa-rupee-sign\"></i>97,500</button>\r\n");
      out.write("                          \r\n");
      out.write("                      </div>\r\n");
      out.write("                      <button class=\"productViewBtn\">View Product</button>\r\n");
      out.write("                   </a>   \r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("                <div class=\"col-3\">\r\n");
      out.write("                  <a href=\"#\">\r\n");
      out.write("                      <img src=\"images/product-img2.jpg\" alt=\"\">\r\n");
      out.write("                      <div class=\"caption\">\r\n");
      out.write("                          <big>Code : GA00006488 </big>\r\n");
      out.write("                          <h4>Samsung Galaxy A80 Dual Variant(4GB,64GB),48MP Rear\r\n");
      out.write("                              23MP Front\r\n");
      out.write("                         </h4>\r\n");
      out.write("                          <button class=\"price\"><i class=\"fas fa-rupee-sign\"></i>22,999</button>\r\n");
      out.write("                          \r\n");
      out.write("                      </div>\r\n");
      out.write("                      <button class=\"productViewBtn\">View Product</button>\r\n");
      out.write("                   </a>   \r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("                <div class=\"col-3\">\r\n");
      out.write("                  <a href=\"#\">\r\n");
      out.write("                      <img src=\"images/product-img3.jpg\" alt=\"\">\r\n");
      out.write("                      <div class=\"caption\">\r\n");
      out.write("                          <big>Code : GA00006488 </big>\r\n");
      out.write("                          <h4>Applie MacBook Air MQ032 14.5 Intel Core i5\r\n");
      out.write("                          5550U 8GB DDR3</h4>\r\n");
      out.write("                          <button class=\"price\"><i class=\"fas fa-rupee-sign\"></i>11,000</button>\r\n");
      out.write("                          \r\n");
      out.write("                      </div>\r\n");
      out.write("                      <button class=\"productViewBtn\">View Product</button>\r\n");
      out.write("                   </a>   \r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("                <div class=\"col-3\">\r\n");
      out.write("                  <a href=\"\">\r\n");
      out.write("                     <img src=\"images/product-img4.jpg\" alt=\"\">\r\n");
      out.write("                      <div class=\"caption\">\r\n");
      out.write("                          <big>Code : GA00006488 </big>\r\n");
      out.write("                          <h4>Applie MacBook Air MQ032 14.5 Intel Core i5\r\n");
      out.write("                          5550U 8GB DDR3</h4>\r\n");
      out.write("                          <button class=\"price\"><i class=\"fas fa-rupee-sign\"></i>21,700</button>\r\n");
      out.write("                          \r\n");
      out.write("                      </div>\r\n");
      out.write("                      <button class=\"productViewBtn\">View Product</button>\r\n");
      out.write("-                   </a>   \r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("                <div class=\"col-3\">\r\n");
      out.write("                  <a href=\"#\">\r\n");
      out.write("                      <img src=\"images/product-img2.jpg\" alt=\"\">\r\n");
      out.write("                      <div class=\"caption\">\r\n");
      out.write("                          <big>Code : GA00006488 </big>\r\n");
      out.write("                          <h4>Applie MacBook Air MQ032 14.5 Intel Core i5\r\n");
      out.write("                          5550U 8GB DDR3</h4>\r\n");
      out.write("                          <button class=\"price\"><i class=\"fas fa-rupee-sign\"></i>500</button>\r\n");
      out.write("                          \r\n");
      out.write("                      </div>\r\n");
      out.write("                      <button class=\"productViewBtn\">View Product</button>\r\n");
      out.write("                   </a>   \r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("                <div class=\"col-3\">\r\n");
      out.write("                  <a href=\"#\">\r\n");
      out.write("                      <img src=\"images/product-img3.jpg\" alt=\"\">\r\n");
      out.write("                      <div class=\"caption\">\r\n");
      out.write("                          <big>Code : GA00006488 </big>\r\n");
      out.write("                          <h4>Applie MacBook Air MQ032 14.5 Intel Core i5\r\n");
      out.write("                          5550U 8GB DDR3</h4>\r\n");
      out.write("                          <button class=\"price\"><i class=\"fas fa-rupee-sign\"></i>999</button>\r\n");
      out.write("                          \r\n");
      out.write("                      </div>\r\n");
      out.write("                      <button class=\"productViewBtn\">View Product</button>\r\n");
      out.write("                   </a>   \r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("                <div class=\"col-3\">\r\n");
      out.write("                  <a href=\"#\">\r\n");
      out.write("                      <img src=\"images/product-img4.jpg\" alt=\"\">\r\n");
      out.write("                      <div class=\"caption\">\r\n");
      out.write("                          <big>Code : GA00006488 </big>\r\n");
      out.write("                          <h4>Applie MacBook Air MQ032 14.5 Intel Core i5\r\n");
      out.write("                          5550U 8GB DDR3</h4>\r\n");
      out.write("                          <button class=\"price\"><i class=\"fas fa-rupee-sign\"></i>1100</button>\r\n");
      out.write("                          \r\n");
      out.write("                      </div>\r\n");
      out.write("                      <button class=\"productViewBtn\">View Product</button>\r\n");
      out.write("                   </a>   \r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("                <div class=\"col-3\">\r\n");
      out.write("                  <a href=\"\">\r\n");
      out.write("                     <img src=\"images/product-img1.jpg\" alt=\"\">\r\n");
      out.write("                      <div class=\"caption\">\r\n");
      out.write("                          <big>Code : GA00006488 </big>\r\n");
      out.write("                          <h4>Applie MacBook Air MQ032 14.5 Intel Core i5\r\n");
      out.write("                          5550U 8GB DDR3</h4>\r\n");
      out.write("                          <button class=\"price\"><i class=\"fas fa-rupee-sign\"></i>700</button>\r\n");
      out.write("                          \r\n");
      out.write("                      </div>\r\n");
      out.write("                      <button class=\"productViewBtn\">View Product</button>\r\n");
      out.write("-                   </a>   \r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("                <h3>New 2019 Fresh Products</h3>\r\n");
      out.write("                 <div class=\"col-3\">\r\n");
      out.write("                  <a href=\"\">\r\n");
      out.write("                     <img src=\"images/product-img5.jpg\" alt=\"\">\r\n");
      out.write("                      <div class=\"caption\">\r\n");
      out.write("                          <big>Code : GA00006488 </big>\r\n");
      out.write("                          <h4>Applie MacBook Air MQ032 14.5 Intel Core i5\r\n");
      out.write("                          5550U 8GB DDR3</h4>\r\n");
      out.write("                          <button class=\"price\"><i class=\"fas fa-rupee-sign\"></i>700</button>\r\n");
      out.write("                          \r\n");
      out.write("                      </div>\r\n");
      out.write("                      <button class=\"productViewBtn\">View Product</button>\r\n");
      out.write("-                   </a>   \r\n");
      out.write("                </div>\r\n");
      out.write("                 \r\n");
      out.write("                <div class=\"col-3\">\r\n");
      out.write("                  <a href=\"\">\r\n");
      out.write("                     <img src=\"images/product-img6.jpg\" alt=\"\">\r\n");
      out.write("                      <div class=\"caption\">\r\n");
      out.write("                          <big>Code : GA00006488 </big>\r\n");
      out.write("                          <h4>Applie MacBook Air MQ032 14.5 Intel Core i5\r\n");
      out.write("                          5550U 8GB DDR3</h4>\r\n");
      out.write("                          <button class=\"price\"><i class=\"fas fa-rupee-sign\"></i>700</button>\r\n");
      out.write("                          \r\n");
      out.write("                      </div>\r\n");
      out.write("                      <button class=\"productViewBtn\">View Product</button>\r\n");
      out.write("-                   </a>   \r\n");
      out.write("                </div>\r\n");
      out.write("                 \r\n");
      out.write("                <div class=\"col-3\">\r\n");
      out.write("                  <a href=\"\">\r\n");
      out.write("                     <img src=\"images/product-img7.jpg\" alt=\"\">\r\n");
      out.write("                      <div class=\"caption\">\r\n");
      out.write("                          <big>Code : GA00006488 </big>\r\n");
      out.write("                          <h4>Applie MacBook Air MQ032 14.5 Intel Core i5\r\n");
      out.write("                          5550U 8GB DDR3</h4>\r\n");
      out.write("                          <button class=\"price\"><i class=\"fas fa-rupee-sign\"></i>700</button>\r\n");
      out.write("                          \r\n");
      out.write("                      </div>\r\n");
      out.write("                      <button class=\"productViewBtn\">View Product</button>\r\n");
      out.write("-                   </a>   \r\n");
      out.write("                </div>\r\n");
      out.write("                 \r\n");
      out.write("                <div class=\"col-3\">\r\n");
      out.write("                  <a href=\"\">\r\n");
      out.write("                     <img src=\"images/product-img8.jpg\" alt=\"\">\r\n");
      out.write("                      <div class=\"caption\">\r\n");
      out.write("                          <big>Code : GA00006488 </big>\r\n");
      out.write("                          <h4>Applie MacBook Air MQ032 14.5 Intel Core i5\r\n");
      out.write("                          5550U 8GB DDR3</h4>\r\n");
      out.write("                          <button class=\"price\"><i class=\"fas fa-rupee-sign\"></i>700</button>\r\n");
      out.write("                          \r\n");
      out.write("                      </div>\r\n");
      out.write("                      <button class=\"productViewBtn\">View Product</button>\r\n");
      out.write("-                   </a>   \r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("        <div class=\"news\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <h3>Greatest Offer</h3>\r\n");
      out.write("                <div class=\"owl-carousel\">\r\n");
      out.write("                    <div class=\"item\"><img src=\"images/product-img9.jpg\"></div>\r\n");
      out.write("                    <div class=\"item\"><img src=\"images/product-img10.jpg\"></div>\r\n");
      out.write("                    <div class=\"item\"><img src=\"images/product-img11.jpg\"></div>\r\n");
      out.write("                    <div class=\"item\"><img src=\"images/product-img12.jpg\"></div>\r\n");
      out.write("                    <div class=\"item\"><img src=\"images/product-img10.jpg\"></div>\r\n");
      out.write("                    \r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("        <div class=\"support\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <a href=\"#\">\r\n");
      out.write("                    <img src=\"images/icon_1.png\">\r\n");
      out.write("                    <h5>Fast Delivery</h5>\r\n");
      out.write("                </a>\r\n");
      out.write("                <a href=\"#\">\r\n");
      out.write("                    <img src=\"images/icon_2.png\">\r\n");
      out.write("                    <h5>Support 24 Hours</h5>\r\n");
      out.write("                </a>\r\n");
      out.write("                <a href=\"#\">\r\n");
      out.write("                    <img src=\"images/icon_3.png\">\r\n");
      out.write("                    <h5>Easy Payment Method</h5>\r\n");
      out.write("                </a>\r\n");
      out.write("                <a href=\"#\">\r\n");
      out.write("                    <img src=\"images/icon_4.png\">\r\n");
      out.write("                    <h5>Sell on E-Shop</h5>\r\n");
      out.write("                </a>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("                \r\n");
      out.write("       \r\n");
      out.write("                \r\n");
      out.write("        <script src=\"jquery-3.4.1.min.js\"></script>\r\n");
      out.write("        \r\n");
      out.write("                \r\n");
      out.write("        <script src=\"jquery.cycle.js\"></script>     \r\n");
      out.write("          <script src=\"owl.carousel.min.js\"></script>   \r\n");
      out.write("        <script>\r\n");
      out.write("            $(\"#slidershuffle\").cycle({\r\n");
      out.write("                next:'#next',\r\n");
      out.write("                prev:'#prev'\r\n");
      out.write("            });\r\n");
      out.write("            \r\n");
      out.write("            $('.owl-carousel').owlCarousel({\r\n");
      out.write("                item: 4,\r\n");
      out.write("                loop: true,\r\n");
      out.write("                margin: 15,\r\n");
      out.write("                autoplay: true,\r\n");
      out.write("                autoplayTimeout:3000,\r\n");
      out.write("                nav: true,\r\n");
      out.write("                responsiveClass: true,\r\n");
      out.write("                responsive:{\r\n");
      out.write("                    0:{\r\n");
      out.write("                        items: 1,\r\n");
      out.write("                        nav: true\r\n");
      out.write("                    },\r\n");
      out.write("                    600:{\r\n");
      out.write("                        items: 3,\r\n");
      out.write("                        nav: true\r\n");
      out.write("                    },\r\n");
      out.write("                    1000:{\r\n");
      out.write("                        items:4,\r\n");
      out.write("                        nav: true\r\n");
      out.write("                    }\r\n");
      out.write("                    \r\n");
      out.write("                }\r\n");
      out.write("            });\r\n");
      out.write("            \r\n");
      out.write("            $(function(){\r\n");
      out.write("                $(\".topbar ul li\").click(function(){\r\n");
      out.write("                    $(\".topbar ul li\").not(this).find(\"ul\").slideUp();\r\n");
      out.write("                    $(this).find(\"ul\").slideToggle();\r\n");
      out.write("                });\r\n");
      out.write("               \r\n");
      out.write("                $(\".topbar ul li ul li, productCategories ul li .megamenu\").click(function(e){\r\n");
      out.write("                    e.stopPropagation();\r\n");
      out.write("                });\r\n");
      out.write("                \r\n");
      out.write("                $(\".productCategories ul li\").click(function(){\r\n");
      out.write("                    $(\".productCategories ul li\").not(this).find(\".megamenu\").hide();\r\n");
      out.write("                    $(this).find(\".megamenu\").toggle();\r\n");
      out.write("                });\r\n");
      out.write("               \r\n");
      out.write("                \r\n");
      out.write("            });\r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("        </script>\r\n");
      out.write("       \r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}