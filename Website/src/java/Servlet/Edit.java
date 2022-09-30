package servlet;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Shop;
/**
 *
 * @author User
 */
@WebServlet(urlPatterns = {"/Order2"})
public class Edit extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        HttpSession session = request.getSession();
        Shop  shopinfo = (Shop) session.getAttribute("shop");
        session.removeAttribute("shop");
        PrintWriter out = response.getWriter();
        
        out.println("<html><body>");
        out.println("ข้อมูลเดิม: "+"ชื่อรุ่น" + shopinfo.getModelName()
                + "สี" + shopinfo.getColor() + ","
                + "ไซส์:  " + shopinfo.getSize()
                + "เบอร์โทร:  " + shopinfo.getPhone());
        
        out.println("<div style='text-align: center' >");
        out.println("<h1>แก้ไขคำสั่งซื้อ</h1>");
        out.println("<form action='Order3'>");
        out.println("ชื่อเมนู : <input type='text' name='modelName' value="
                    + shopinfo.getModelName() + "><br/>");
            out.println("สี : ");
            if (shopinfo.getColor().trim().equals("ขาว")) {
                out.println("<input type='radio' name='color' value='ขาว' Checked>ขาว ");
            } else {
                out.println("<input type='radio' name='color' value='ขาว'>ขาว ");

            }
            if (shopinfo.getColor().trim().equals("ดำ")) {
                out.println("<input type='radio' name='color' value='ดำ' Checked>ดำ ");
            } else {
                out.println("<input type='radio' name='color' value='ดำ'>ดำ ");

            }
            if (shopinfo.getColor().trim().equals("ชมพู")) {
                out.println("<input type='radio' name='color' value='ชมพู' Checked>ชมพู ");
            } else {
                out.println("<input type='radio' name='color' value='ชมพู'>ชมพู ");

            }
            if (shopinfo.getColor().trim().equals("ฟ้า")) {
                out.println("<input type='radio' name='color' value='ฟ้า' Checked>ฟ้า ");
            } else {
                out.println("<input type='radio' name='color' value='ฟ้า'>ฟ้า <br/>");

            }
            out.println("ไซส์ : ");
            if (shopinfo.getSize().trim().equals("S")) {
                out.println("<input type='radio' name='size' value='S' Checked>S ");
            } else {
                out.println("<input type='radio' name='size' value='S'>S ");

            }
            if (shopinfo.getSize().trim().equals("M")) {
                out.println("<input type='radio' name='size' value='M' Checked>M ");
            } else {
                out.println("<input type='radio' name='size' value='M'>M ");

            }
            if (shopinfo.getSize().trim().equals("L")) {
                out.println("<input type='radio' name='size' value='L' Checked>L ");
            } else {
                out.println("<input type='radio' name='size' value='L'>L ");

            }
            if (shopinfo.getSize().trim().equals("XL")) {
                out.println("<input type='radio' name='size' value='XL' Checked>XL ");
            } else {
                out.println("<input type='radio' name='size' value='XL'>XL <br/>");
            }
            out.println("เบอร์ : <input type='text' name='phone' value="
                    + shopinfo.getPhone() + "></br>");
            
        out.println("<input type='submit' value='ยืนยันแก้ไขประวัติ'><br/>");
        out.println("</div>");
        out.println("<html/><body/>");
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
