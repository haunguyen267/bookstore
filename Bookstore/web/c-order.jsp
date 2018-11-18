<%-- 
    Document   : c-order
    Created on : Nov 17, 2018, 7:38:55 PM
    Author     : Tran Tuan Anh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="vendor/bootstrap/bootstrap.css" rel="stylesheet" media="all">
        <link href="css/clientOrder.css" rel="stylesheet" media="all">
        <script src="https://code.jquery.com/jquery-3.3.1.min.js" integrity="sha256-FgpCb/KJQlLNfOu91ta32o/NMZxltwRo8QtmkMRdAu8=" crossorigin="anonymous"></script>
        <script src="vendor/bootstrap/bootstrap.min.js"></script>

        <script src="js/clientOrder.js"></script>
        
        <title>Order</title>
    </head>
    <body>
    <form class="checkout woocommerce-checkout">
    <div class="row">
        <div class="col-lg-6">
            <h3 class="title title--sbold title--xs m-b-20"> Cart </h3>
        </div>
        <div class="col-lg-6">
            <h3 class="title title--sbold title--xs m-b-20">Payment Method</h3>
            <div class="woocommerce-checkout-review-order">
            </div>
            <div class="woocommerce-checkout-payment">
                <div class="woocommerce-checkout-payment-item">
                    <div class="au-radio-group">
                        <input class="js-radio-input" type="radio" name="payment" id="direct" checked="checked">
                        <label for="direct">Direct bank transfer</label>
                    </div>
                    <div class="woocommerce-checkout-payment-content js-radio-content">
                        <p>
                            Make your payment directly into our bank account. Please use your Order ID as the payment reference. Your order will not be shipped until the funds have cleared in our account.
                        </p>
                    </div>
                </div>
                
                <div class="woocommerce-checkout-payment-item">
                    <div class="au-radio-group">
                        <input class="js-radio-input" type="radio" name="payment" id="cash">
                        <label for="cash">Cash on delivery</label>
                    </div>
                    <div class="woocommerce-checkout-payment-content js-radio-content">
                        <p>Pay with cash upon delivery.</p>
                    </div>
                </div>
            </div>
            <div class="place-order">
                <noscript>
                    Since your browser does not support JavaScript, or it is disabled, please ensure you click the
                    <em>Update Totals</em>button before placing your order. You may be charged more than the amount stated above if you fail to do so.</noscript>
                <button class="au-btn-3 au-btn2--blue" type="submit">Place order
                    <i class="zmdi zmdi-chevron-right"></i>
                    <i class="zmdi zmdi-chevron-right"></i>
                </button>
            </div>
        </div>
    </div>
    
        
        
    </body>
</html>
