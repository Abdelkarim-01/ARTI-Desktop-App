package com.arti.artiDesktop.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import net.rgielen.fxweaver.core.FxmlView;
import org.springframework.stereotype.Controller;

@Controller
@FxmlView("Admin_space.fxml")
public class AdminController {

    public AnchorPane ancropane_info_agent;
    public TableView table_classement_rendez_vous;
    public TableColumn col_classemnt_rendezvous;
    public TableColumn col_nom_rendezvous;
    public TableColumn col_prenom_rendezvous;
    public TableColumn col_nbr_rendezvous;
    public AnchorPane ancropane_info_agent1;
    public TableView tableviewpresence;
    public TableColumn col_datejour_prese;
    public TableColumn col_heureentree_prese;
    public TableColumn col_heuresortie_prese;
    public AnchorPane ancropane_info_agent11;
    public TableView table_rendezvous;
    public TableColumn col_id_rendez;
    public TableColumn col_nomclient_rendez;
    public TableColumn col_prenomclient_rendez;
    public TableColumn col_date_rendez;
    public TableColumn col_etat_rendez;
    public TableColumn col_commentaire_rendez;
    public Label label_plait_entrer_commentaire;
    public AnchorPane ancropane_info_agent111;
    @FXML
    private Button Edit_Btn;
    @FXML
    private Label adim_nom_label;
    @FXML
    private Button ajou_sup_btn;
    @FXML
    private Button ajouter_comentaire_btn;
    @FXML
    private Button btn_presence;
    @FXML
    private Button btn_rendez_vous;
    @FXML
    private Circle circle_profile;
    @FXML
    private Button logout_btn;
    @FXML
    private ListView<String> listview_agent;
    @FXML
    private TextField tex_recherhe_agent;
    @FXML
    private Label lab_datnaiss_agent;
    @FXML
    private Label lab_inscrip_agent1;
    @FXML
    private Label lab_email_agent;
    @FXML
    private Label lab_nom_agent;
    @FXML
    private Label lab_prenom_agent;
    @FXML
    private Label lab_tele_agent;
    @FXML
    private Label lab_ville_agent;
    @FXML
    private Rectangle rect_photo_agent;
    @FXML
    private AnchorPane anchorepane_commentaire;
    @FXML
    private AnchorPane anchorepane_présence;
    @FXML
    private AnchorPane anchorepane_rendezvous;
    @FXML
    private AnchorPane anchorpane_supagnet;
    @FXML
    private TextField tex_recherhe_agent1;
    @FXML
    private Rectangle rect_photo_agent1;
    @FXML
    private ListView<String> listview_agent1;
    @FXML
    private Label lab_nom_agent1;
    @FXML
    private Label lab_prenom_agent1;
    @FXML
    private Label lab_tele_agent1;
    @FXML
    private Label lab_email_agent1;
    @FXML
    private Label lab_ville_agent1;
    @FXML
    private Label lab_datnaiss_agent1;
    @FXML
    private Label lab_inscrip_agent11;
    @FXML
    private TextField tex_recherhe_agent11;
    @FXML
    private Rectangle rect_photo_agent11;
    @FXML
    private ListView<String> listview_agent11;
    @FXML
    private Label lab_nom_agent11;
    @FXML
    private Label lab_prenom_agent11;
    @FXML
    private Label lab_tele_agent11;
    @FXML
    private Label lab_email_agent11;
    @FXML
    private Label lab_ville_agent11;
    @FXML
    private Label lab_datnaiss_agent11;
    @FXML
    private Label lab_inscrip_agent111;
    @FXML
    private TextField tex_recherhe_agent111;
    @FXML
    private Rectangle rect_photo_agent111;
    @FXML
    private ListView<String> listview_agent111;
    @FXML
    private Label lab_nom_agent111;
    @FXML
    private Label lab_prenom_agent111;
    @FXML
    private Label lab_tele_agent111;
    @FXML
    private Label lab_email_agent111;
    @FXML
    private Label lab_ville_agent111;
    @FXML
    private DatePicker date_nombre_rendez_vous_A;
    @FXML
    private DatePicker date_nombre_rendez_vous_De;
    @FXML
    private Button btn_nbr_rendez_vous;
    @FXML
    private Label label_nombre_rendz_vous;
    @FXML
    private Label label_nombre_rendez_vous_A;
    @FXML
    private Label label_nombre_rendez_vous_De;
    @FXML
    private Label label_plait_rendezvous;
    @FXML
    private Button btn_apliquez_rendezvous_classement;
    @FXML
    private DatePicker date_endezvous_classement_a;
    @FXML
    private DatePicker date_endezvous_classement_de;
    @FXML
    private Label label_classement_rendez_vous_a;
    @FXML
    private Label label_classement_rendez_vous_de;

    @FXML
    private Button btn_tout_les_moi;
    @FXML
    private Button btn_dans_cemois;
    @FXML
    private Label label_plait_presence;
    @FXML
    private Button btn_valider_rendezvous;
    @FXML
    private Label label_plait_commentaire;
    @FXML
    private Label lab_choisireta;
    @FXML
    private Label label_plait_sup_agent;
    @FXML
    private TextField text_ID_rendez_vous;
    @FXML
    private ComboBox<String> combobox_eta_rendez_vous=new ComboBox<>();
    @FXML
    private Button btn_valider_etat;
    @FXML
    private Button btn_ajouter_coment;

    @FXML
    private TextField username_field;
    @FXML
    private TextField password_field;
    @FXML
    private TextField nom_field;
    @FXML
    private TextField prenom_field;
    @FXML
    private TextField email_field;
    @FXML
    private TextField telephone_field;
    @FXML
    private TextField ville_field;
    @FXML
    private DatePicker date_naiss_field;
    @FXML
    private Button btn_import_image;
    @FXML
    private Button btn_ajouter_agent;
    @FXML
    private Label lab_username_field;
    @FXML
    private Label lab_password_field;
    @FXML
    private Label lab_nom_field;
    @FXML
    private Label lab_prenom_field;
    @FXML
    private Label lab_email_field;
    @FXML
    private Label lab_telephone_field;
    @FXML
    private Label lab_ville_field;
    @FXML
    private Label lab_date_naiss_field;
    @FXML
    private Label lab_import_image;
    @FXML
    private TextArea textarea_comment_rendezvous;

    public void choisirimage_admin(ActionEvent actionEvent) {
    }

    public void onactionbtn_rendez_vous(ActionEvent actionEvent) {
    }

    public void onactionajouter_comentaire_btn(ActionEvent actionEvent) {
    }

    public void onactionbtn_presence(ActionEvent actionEvent) {
    }

    public void onactionajou_sup_btn(ActionEvent actionEvent) {
    }

    public void logout(ActionEvent actionEvent) {
    }

    public void masquerlistview(MouseEvent mouseEvent) {
    }

    public void metre_ajour_liste_agent(KeyEvent keyEvent) {
    }

    public void select_items_from_list(MouseEvent mouseEvent) {
    }

    public void onaction_btn_nbr_rendez_vous(ActionEvent actionEvent) {
    }

    public void tableclassementDisplayData(ActionEvent actionEvent) {
    }

    public void masquerlistview1(MouseEvent mouseEvent) {
    }

    public void metre_ajour_liste_agent1(KeyEvent keyEvent) {
    }

    public void select_items_from_list1(MouseEvent mouseEvent) {
    }

    public void tablepresenceDisplayData1(ActionEvent actionEvent) {
    }

    public void tablepresenceDisplayData(ActionEvent actionEvent) {
    }

    public void masquerlistview11(MouseEvent mouseEvent) {
    }

    public void metre_ajour_liste_agent11(KeyEvent keyEvent) {
    }

    public void tablecommentaireDisplayData(ActionEvent actionEvent) {
    }

    public void select_items_from_list11(MouseEvent mouseEvent) {
    }

    public void modifier_etat(ActionEvent actionEvent) {
    }

    public void Ajouter_commentaire(ActionEvent actionEvent) {
    }

    public void masquerlistview111(MouseEvent mouseEvent) {
    }

    public void metre_ajour_liste_agent111(KeyEvent keyEvent) {
    }

    public void select_items_from_list111(MouseEvent mouseEvent) {
    }

    public void suprimeragent(ActionEvent actionEvent) {
    }

    public void ajouteragent(ActionEvent actionEvent) {
    }

    public void choisirimage(ActionEvent actionEvent) {
    }
//    @FXML
//    private TableView<table_classement> table_classement_rendez_vous;
//
//    @FXML
//    private TableColumn<table_classement, Integer> col_classemnt_rendezvous;
//
//    @FXML
//    private TableColumn<table_classement, String> col_nom_rendezvous;
//
//    @FXML
//    private TableColumn<table_classement, String> col_prenom_rendezvous;
//
//    @FXML
//    private TableColumn<table_classement, Integer> col_nbr_rendezvous;
//
//    @FXML
//    private TableView<tablepresenceclass> tableviewpresence;
//
//    @FXML
//    private TableColumn<tablepresenceclass, String> col_datejour_prese;
//
//    @FXML
//    private TableColumn<tablepresenceclass, String> col_heureentree_prese;
//
//    @FXML
//    private TableColumn<tablepresenceclass, String> col_heuresortie_prese;
//    @FXML
//    private TableView<rendezvousclass> table_rendezvous;
//    @FXML
//    private TableColumn<rendezvousclass, String> col_nomclient_rendez;
//    @FXML
//    private TableColumn<rendezvousclass, String> col_prenomclient_rendez;
//    @FXML
//    private TableColumn<rendezvousclass, String> col_date_rendez;
//    @FXML
//    private TableColumn<rendezvousclass, String> col_etat_rendez;
//    @FXML
//    private TableColumn<rendezvousclass, String> col_commentaire_rendez;
//    @FXML
//    private TableColumn<rendezvousclass, String> col_id_rendez;
}
