package net.cloudcentrik.woocommerceclient.view;

import javafx.concurrent.Task;
import javafx.fxml.FXML;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextArea;
import net.cloudcentrik.woocommerceclient.EndpointBaseType;
import net.cloudcentrik.woocommerceclient.WooCommerceApiClient;
import net.cloudcentrik.woocommerceclient.WooCommerceJsonUtils;


public class ApiService extends Task<String> {
    @FXML
    TextArea textArea;
    @FXML
    ProgressBar progressBar;
    EndpointBaseType endpointBaseType;
    public ApiService(TextArea textArea, ProgressBar progressBar, EndpointBaseType endpointBaseType){
        this.textArea=textArea;
        this.progressBar=progressBar;
        this.endpointBaseType=endpointBaseType;
        progressBar.progressProperty().bind(this.progressProperty());
    }

    @Override
    protected String call() throws Exception {
        String response="";
        switch (endpointBaseType){
            case PRODUCTS:response= WooCommerceApiClient.getAllProduct();break;
            case PRODUCTS_ATTRIBUTES:response= WooCommerceApiClient.getAllProductAttributes();break;
        }

        updateMessage("calling api service");
        for (int p = 0; p < 100; p++) {
            Thread.sleep(40);
            updateProgress(p, 100);
        }
        return response;
    }

    @Override
    protected void succeeded(){
        super.succeeded();
        this.textArea.setText(WooCommerceJsonUtils.prettifyJson(this.getValue()));

    }

    @Override protected void cancelled() {
        super.cancelled();
        updateMessage("Cancelled!");
    }

    @Override protected void failed() {
        super.failed();
        updateMessage("Failed!");
    }

}