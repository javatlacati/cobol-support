package com.ibm.intellij.plugins.cobol;

import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.options.colors.AttributesDescriptor;
import com.intellij.openapi.options.colors.ColorDescriptor;
import com.intellij.openapi.options.colors.ColorSettingsPage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.Icon;
import java.util.Map;

public class CobolColorSettingsPage implements ColorSettingsPage {

    private static final AttributesDescriptor[] DESCRIPTORS = new AttributesDescriptor[]{
            new AttributesDescriptor("Keyword", CobolSyntaxHighlighter.KEY),
            new AttributesDescriptor("Pseudo Keyword", CobolSyntaxHighlighter.PSEUDO_KEYWORD),
            new AttributesDescriptor("Line Comment", CobolSyntaxHighlighter.COMMENT),
            new AttributesDescriptor("Operator", CobolSyntaxHighlighter.OPERATOR),
            new AttributesDescriptor("Strings", CobolSyntaxHighlighter.STRING),
            new AttributesDescriptor("Function identifier", CobolSyntaxHighlighter.NAMEFUNCTION),
            new AttributesDescriptor("Constant", CobolSyntaxHighlighter.NAMECONSTANT),
            new AttributesDescriptor("Punched Card Index", CobolSyntaxHighlighter.PUNCHED_CARD_IDX),
//            new AttributesDescriptor("Value", CobolSyntaxHighlighter.VALUE),
//            new AttributesDescriptor("Bad value", CobolSyntaxHighlighter.BAD_CHARACTER)
    };

    @NotNull
    @Override
    public String getDisplayName() {
        return "COBOL";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return CobolIcons.FILE;
    }

    @NotNull
    @Override
    public AttributesDescriptor[] getAttributeDescriptors() {
        return DESCRIPTORS;
    }

    @NotNull
    @Override
    public ColorDescriptor[] getColorDescriptors() {
        return new ColorDescriptor[0];
    }

    @NotNull
    @Override
    public SyntaxHighlighter getHighlighter() {
        return new CobolSyntaxHighlighter();
    }

    @NotNull
    @Override
    public String getDemoText() {
        return "000000* MIT License\n" +
                "      * Copyright (c) 2018 Christer Stig Åke Landstedt\n" +
                "      * \n" +
                "      * Permission is hereby granted, free of charge, to any person obtaining a copy\n" +
                "      * of this software and associated documentation files (the \"Software\"), to deal\n" +
                "      * in the Software without restriction, including without limitation the rights\n" +
                "      * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell\n" +
                "      * copies of the Software, and to permit persons to whom the Software is\n" +
                "      * furnished to do so, subject to the following conditions:\n" +
                "      * \n" +
                "      * The above copyright notice and this permission notice shall be included in all\n" +
                "      * copies or substantial portions of the Software.\n" +
                "      * \n" +
                "      * THE SOFTWARE IS PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR\n" +
                "      * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,\n" +
                "      * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE\n" +
                "      * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER\n" +
                "      * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,\n" +
                "      * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE\n" +
                "      * SOFTWARE.\n" +
                "       \n" +
                "       IDENTIFICATION DIVISION.\n" +
                "       PROGRAM-ID. cob-simpleinventory.\n" +
                "       AUTHOR.  \"Christer Stig Åke Landstedt\".\n" +
                "       ENVIRONMENT DIVISION.\n" +
                "       \n" +
                "       INPUT-OUTPUT SECTION.\n" +
                "         FILE-CONTROL.\n" +
                "           SELECT DATAFILE ASSIGN TO \"cob-simpleinventory.dat\"\n" +
                "             ORGANIZATION IS INDEXED\n" +
                "             ACCESS MODE IS DYNAMIC\n" +
                "             RECORD KEY IS IKEY.\n" +
                "       \n" +
                "       DATA DIVISION.\n" +
                "         FILE SECTION.\n" +
                "         FD DATAFILE\n" +
                "           RECORD CONTAINS 100 CHARACTERS.\n" +
                "         01 DATAFILEFD.\n" +
                "           05 IKEY PIC 9(4).\n" +
                "           05 MN PIC X(9).\n" +
                "           05 NAME PIC X(16).\n" +
                "           05 DES PIC X(40).\n" +
                "           05 INS PIC 9(4)V9(2).\n" +
                "           05 COST PIC 9(5)V9(2).\n" +
                "           05 ICURRENCY PIC X(3).\n" +
                "         WORKING-STORAGE SECTION.\n" +
                "         01 WS-ENDOFFILE PIC 9 VALUE ZERO. \n" +
                "         01 WS-DATAFILEFD.\n" +
                "           05 WS-IKEY PIC 9(4).\n" +
                "           05 WS-MN PIC X(9).\n" +
                "           05 WS-NAME PIC X(16).\n" +
                "           05 WS-DES PIC X(40).\n" +
                "           05 WS-INS PIC 9(4)V9(2).\n" +
                "           05 WS-COST PIC 9(5)V9(2).\n" +
                "           05 WS-ICURRENCY PIC X(3).\n" +
                "         01 DATEANDTIME.\n" +
                "           05 CURRENTDATE.\n" +
                "             10 YY PIC 99.\n" +
                "             10 MM PIC 99.\n" +
                "             10 DD PIC 99.\n" +
                "           05 CURRENTTIME.\n" +
                "             10 TIMEHH PIC 99.\n" +
                "             10 TIMEMM PIC 99.\n" +
                "             10 TIMESS PIC 99.\n" +
                "         01 CURRENTDATE2.\n" +
                "           05 YY2 PIC 9999.\n" +
                "           05 MM2 PIC 99.\n" +
                "           05 DD2 PIC 99.\n" +
                "         LOCAL-STORAGE SECTION.\n" +
                "         01 USER-SELECTION PIC 9 VALUE ZERO.\n" +
                "         01 IID-SELECTION PIC 9(4) VALUE ZERO.\n" +
                "         01 LS-DATAFILE.\n" +
                "           05 LS-IKEY PIC X(12) VALUE \"Part Number\".\n" +
                "           05 LS-MN PIC X(15) VALUE \"| Model Number\".\n" +
                "           05 LS-NAME PIC X(19) VALUE \"| Name\".\n" +
                "           05 LS-DES PIC X(43) VALUE \"| Description\".\n" +
                "           05 LS-INS PIC X(11) VALUE \"| In Stock\".\n" +
                "           05 LS-COST PIC X(6) VALUE \"| Cost\".\n" +
                "       PROCEDURE DIVISION.\n" +
                "       MAIN-PROGRAM.\n" +
                "       0000SELECTIONSTART.\n" +
                "         MOVE 0 TO USER-SELECTION.\n" +
                "         ACCEPT CURRENTDATE2 FROM DATE yyyymmdd.\n" +
                "         DISPLAY \"-----------------------------------------------------\"\n" +
                "                 \"-----------------------------------------------------\"\n" +
                "                 \"-----------\".\n" +
                "         DISPLAY \"Cobol Simple Inventory 0.1 \"YY2\"-\"MM2\"-\"DD2.\n" +
                "         DISPLAY \"-----------------------------------------------------\"\n" +
                "                 \"-----------------------------------------------------\"\n" +
                "                 \"-----------\".\n" +
                "         PERFORM UNTIL USER-SELECTION>0\n" +
                "           DISPLAY \"MENU\"\n" +
                "           DISPLAY \"---------------------------------------------------\"\n" +
                "                   \"---------------------------------------------------\"\n" +
                "                   \"---------------\"\n" +
                "           DISPLAY \"    1 : Inventory\"\n" +
                "           DISPLAY \"    2 : Information\"\n" +
                "           DISPLAY \"    3 : Exit application\"\n" +
                "           DISPLAY \"Select number and press Enter: \"\n" +
                "           ACCEPT USER-SELECTION\n" +
                "           EVALUATE USER-SELECTION\n" +
                "             WHEN 1 GO TO 0000SELECTIONINVENTORY\n" +
                "             WHEN 2 GO TO 0000SELECTIONINFO\n" +
                "             WHEN 3 GO TO 0000SELECTIONQUIT\n" +
                "             WHEN OTHER PERFORM 0000SELECTIONSTARTERROR\n" +
                "           END-EVALUATE\n" +
                "         END-PERFORM.\n" +
                "       0000SELECTIONSTARTERROR.\n" +
                "       DISPLAY \" \".\n" +
                "       DISPLAY \"!ERROR WRONG INPUT!\".\n" +
                "       GO TO 0000SELECTIONSTART.\n" +
                "       \n" +
                "       0000SELECTIONINVENTORY.\n" +
                "         ACCEPT CURRENTDATE2 FROM DATE yyyymmdd.\n" +
                "         MOVE 0 TO USER-SELECTION.\n" +
                "         DISPLAY \" \".\n" +
                "         DISPLAY \"-----------------------------------------------------\"\n" +
                "                 \"-----------------------------------------------------\"\n" +
                "                 \"-----------\".\n" +
                "         DISPLAY \"Inventory \"YY2\"-\"MM2\"-\"DD2.\n" +
                "         DISPLAY \"-----------------------------------------------------\"\n" +
                "                 \"-----------------------------------------------------\"\n" +
                "                 \"-----------\".\n" +
                "         DISPLAY LS-DATAFILE\n" +
                "         DISPLAY \"-----------------------------------------------------\"\n" +
                "                 \"-----------------------------------------------------\"\n" +
                "                 \"-----------\".\n" +
                "         OPEN I-O DATAFILE.\n" +
                "         PERFORM UNTIL WS-ENDOFFILE = 1\n" +
                "           READ DATAFILE INTO WS-DATAFILEFD\n" +
                "             AT END MOVE 1 TO WS-ENDOFFILE\n" +
                "             NOT AT END\n" +
                "               DISPLAY IKEY \"        | \" MN \"    | \"\n" +
                "                 NAME \" | \" DES \" | \" INS \"  | \" COST \" \" ICURRENCY\n" +
                "           END-READ    \n" +
                "         END-PERFORM.\n" +
                "         CLOSE DATAFILE.\n" +
                "         MOVE 0 TO WS-ENDOFFILE.\n" +
                "         PERFORM UNTIL USER-SELECTION>0\n" +
                "           DISPLAY \" \"\n" +
                "           DISPLAY \"---------------------------------------------------\"\n" +
                "                   \"---------------------------------------------------\"\n" +
                "                   \"---------------\"\n" +
                "           DISPLAY \"MENU\"\n" +
                "           DISPLAY \"---------------------------------------------------\"\n" +
                "                   \"---------------------------------------------------\"\n" +
                "                   \"---------------\"\n" +
                "           DISPLAY \"    1 : Add Item to Inventory\"\n" +
                "           DISPLAY \"    2 : Edit Inventory Item\"\n" +
                "           DISPLAY \"    3 : Delete Item In Inventory\"\n" +
                "           DISPLAY \"    4 : Delete ALL Inventory\"\n" +
                "           DISPLAY \"    5 : Go To Main Menu\"\n" +
                "           DISPLAY \"    6 : Exit Application\"\n" +
                "           DISPLAY \"Select number and press Enter: \"\n" +
                "           ACCEPT USER-SELECTION\n" +
                "           EVALUATE USER-SELECTION\n" +
                "             WHEN 1 PERFORM 0000SELECTIONADD\n" +
                "             WHEN 2 PERFORM 0000SELECTIONEDIT\n" +
                "             WHEN 3 PERFORM 0000SELECTIONDELETE\n" +
                "             WHEN 4 PERFORM 0000SELECTIONDELETEALL\n" +
                "             WHEN 5 PERFORM 0000SELECTIONSTART\n" +
                "             WHEN 6 GO TO 0000SELECTIONQUIT\n" +
                "             WHEN OTHER PERFORM 0000SELECTIONCONTACTSERROR\n" +
                "           END-EVALUATE\n" +
                "         END-PERFORM.\n" +
                "       0000SELECTIONCONTACTSERROR.\n" +
                "         DISPLAY \" \".\n" +
                "         DISPLAY \"!ERROR WRONG INPUT!\".\n" +
                "         GO TO 0000SELECTIONINVENTORY.\n" +
                "       0000SELECTIONADD.\n" +
                "       MOVE 0 TO USER-SELECTION.\n" +
                "       DISPLAY \" \".\n" +
                "       DISPLAY \"Enter Part Number (4 digets):\".\n" +
                "       ACCEPT WS-IKEY.\n" +
                "       IF WS-IKEY IS NUMERIC\n" +
                "         ELSE\n" +
                "           DISPLAY \"!!!ERROR WRONG INPUT\"\n" +
                "           GO TO 0000SELECTIONINVENTORY\n" +
                "       END-IF.\n" +
                "       DISPLAY \"Enter Model Number (max 9 characters):\"\n" +
                "       ACCEPT WS-MN\n" +
                "       DISPLAY \"Enter Name (max 16 characters):\"\n" +
                "       ACCEPT WS-NAME\n" +
                "       DISPLAY \"Enter Description (max 40 characters):\"\n" +
                "       ACCEPT WS-DES\n" +
                "       DISPLAY \"Enter In Stock:\"\n" +
                "       ACCEPT WS-INS\n" +
                "       DISPLAY \"Enter Cost Per Unit:\"\n" +
                "       ACCEPT WS-COST\n" +
                "       DISPLAY \"Enter Currency (max 3 characters):\"\n" +
                "       ACCEPT WS-ICURRENCY\n" +
                "       MOVE WS-IKEY TO IKEY.\n" +
                "       MOVE WS-MN TO MN.\n" +
                "       MOVE WS-NAME TO NAME.\n" +
                "       MOVE WS-DES TO DES.\n" +
                "       MOVE WS-INS TO INS.\n" +
                "       MOVE WS-COST TO COST.\n" +
                "       MOVE WS-ICURRENCY TO ICURRENCY.\n" +
                "       MOVE WS-DATAFILEFD TO DATAFILEFD.\n" +
                "       OPEN I-O DATAFILE.\n" +
                "       WRITE DATAFILEFD\n" +
                "         INVALID KEY DISPLAY\"!ERROR RECORD ALREADY EXIST!\"\n" +
                "         NOT INVALID KEY DISPLAY \"Item Added.\"\n" +
                "       END-WRITE.\n" +
                "       CLOSE DATAFILE.\n" +
                "       GO TO 0000SELECTIONINVENTORY.\n" +
                "       0000SELECTIONEDIT.\n" +
                "         MOVE 0 TO USER-SELECTION.\n" +
                "         DISPLAY \" \".\n" +
                "         DISPLAY \"Enter Part Number To Edit:\".\n" +
                "         ACCEPT WS-IKEY.\n" +
                "         MOVE WS-IKEY TO IKEY.\n" +
                "         OPEN I-O DATAFILE.\n" +
                "           READ DATAFILE INTO WS-DATAFILEFD\n" +
                "             KEY IS IKEY\n" +
                "             INVALID KEY\n" +
                "               DISPLAY \"!ERROR PART NUMBER DOSE NOT EXIST!\"\n" +
                "               PERFORM 0000SELECTIONEDITERROR2\n" +
                "             NOT INVALID KEY\n" +
                "               IF WS-IKEY IS NUMERIC\n" +
                "                 DISPLAY \" \"\n" +
                "                 ELSE\n" +
                "                   DISPLAY \"!!!ERROR WRONG INPUT\"\n" +
                "                   PERFORM 0000SELECTIONEDITERROR2\n" +
                "                 END-IF\n" +
                "           END-READ.\n" +
                "         CLOSE DATAFILE.\n" +
                "       PERFORM UNTIL USER-SELECTION>0\n" +
                "         DISPLAY \" \"\n" +
                "         DISPLAY \"---------------------------------------------------\"\n" +
                "                 \"---------------------------------------------------\"\n" +
                "                 \"-----------\"\n" +
                "         DISPLAY \"MENU\"\n" +
                "         DISPLAY \"---------------------------------------------------\"\n" +
                "                 \"---------------------------------------------------\"\n" +
                "                 \"-----------\"\n" +
                "         DISPLAY \"    1 : Edit Model Number\"\n" +
                "         DISPLAY \"    2 : Edit Name\"\n" +
                "         DISPLAY \"    3 : Edit Description\"\n" +
                "         DISPLAY \"    4 : Edit Stock\"\n" +
                "         DISPLAY \"    5 : Edit Cost\"\n" +
                "         DISPLAY \"    6 : Edit Currency\"\n" +
                "         DISPLAY \"    7 : Cancel Edit\"\n" +
                "         DISPLAY \"Select number and press Enter: \"\n" +
                "         ACCEPT USER-SELECTION\n" +
                "         EVALUATE USER-SELECTION\n" +
                "           WHEN 1 PERFORM 0000SELECTIONEDITMODEL\n" +
                "           WHEN 2 PERFORM 0000SELECTIONEDITNAME\n" +
                "           WHEN 3 PERFORM 0000SELECTIONEDITDESCRIPTION\n" +
                "           WHEN 4 PERFORM 0000SELECTIONEDITSTOCK\n" +
                "           WHEN 5 PERFORM 0000SELECTIONEDITCOST\n" +
                "           WHEN 6 PERFORM 0000SELECTIONEDITCURRENCY\n" +
                "           WHEN 7 GO TO 0000SELECTIONINVENTORY\n" +
                "           WHEN OTHER PERFORM 0000SELECTIONEDITERROR\n" +
                "         END-EVALUATE\n" +
                "       END-PERFORM.\n" +
                "         0000SELECTIONEDITMODEL.\n" +
                "           DISPLAY \" \".\n" +
                "           DISPLAY \"New Model Number:\"\n" +
                "           ACCEPT WS-MN.\n" +
                "           GO TO 0000CONTINUEEDIT.\n" +
                "         0000SELECTIONEDITNAME.\n" +
                "           DISPLAY \" \".\n" +
                "           DISPLAY \"New Name:\"\n" +
                "           ACCEPT WS-NAME.\n" +
                "           GO TO 0000CONTINUEEDIT.\n" +
                "         0000SELECTIONEDITDESCRIPTION.\n" +
                "           DISPLAY \" \".\n" +
                "           DISPLAY \"New Description:\"\n" +
                "           ACCEPT WS-DES.\n" +
                "           GO TO 0000CONTINUEEDIT.\n" +
                "         0000SELECTIONEDITSTOCK.\n" +
                "           DISPLAY \" \".\n" +
                "           DISPLAY \"New Stock:\"\n" +
                "           ACCEPT WS-INS.\n" +
                "           GO TO 0000CONTINUEEDIT.\n" +
                "         0000SELECTIONEDITCOST.\n" +
                "           DISPLAY \" \".\n" +
                "           DISPLAY \"New Cost:\"\n" +
                "           ACCEPT WS-COST.\n" +
                "           GO TO 0000CONTINUEEDIT.\n" +
                "         0000SELECTIONEDITCURRENCY.\n" +
                "           DISPLAY \" \".\n" +
                "           DISPLAY \"New Currency:\"\n" +
                "           ACCEPT WS-ICURRENCY.\n" +
                "           GO TO 0000CONTINUEEDIT.\n" +
                "         0000CONTINUEEDIT.\n" +
                "         OPEN I-O DATAFILE.\n" +
                "         MOVE WS-IKEY TO IKEY.\n" +
                "         MOVE WS-MN TO MN.\n" +
                "         MOVE WS-NAME TO NAME.\n" +
                "         MOVE WS-DES TO DES.\n" +
                "         MOVE WS-INS TO INS.\n" +
                "         MOVE WS-COST TO COST.\n" +
                "         MOVE WS-ICURRENCY TO ICURRENCY.\n" +
                "           REWRITE DATAFILEFD\n" +
                "             INVALID KEY DISPLAY\"!ERROR CONTACT DOSE NOT EXIST!\"\n" +
                "             NOT INVALID KEY DISPLAY \"Item Updated.\"\n" +
                "           END-REWRITE.\n" +
                "         CLOSE DATAFILE.\n" +
                "       GO TO 0000SELECTIONINVENTORY.\n" +
                "       0000SELECTIONEDITERROR.\n" +
                "       DISPLAY \" \".\n" +
                "       DISPLAY \"!ERROR WRONG INPUT!\".\n" +
                "       GO TO 0000SELECTIONEDIT.\n" +
                "       0000SELECTIONEDITERROR2.\n" +
                "         CLOSE DATAFILE.\n" +
                "         GO TO 0000SELECTIONINVENTORY.\n" +
                "       0000SELECTIONDELETE.\n" +
                "         MOVE 0 TO USER-SELECTION.\n" +
                "         DISPLAY \" \".\n" +
                "         DISPLAY \"---------------------------------------------------\"\n" +
                "                 \"---------------------------------------------------\"\n" +
                "                 \"---------------\".\n" +
                "         DISPLAY \"Enter Part Number Of Item To Be Deleted:\".\n" +
                "         ACCEPT WS-IKEY.\n" +
                "         MOVE WS-IKEY TO IKEY.\n" +
                "         OPEN I-O DATAFILE.\n" +
                "           READ DATAFILE INTO WS-DATAFILEFD\n" +
                "             KEY IS IKEY\n" +
                "             INVALID KEY\n" +
                "               DISPLAY \"!ERROR PART NUMBER DOSE NOT EXIST!\"\n" +
                "               PERFORM 0000SELECTIONDELETEERROR2\n" +
                "             NOT INVALID KEY\n" +
                "               IF WS-IKEY IS NUMERIC\n" +
                "                 MOVE WS-IKEY TO IKEY\n" +
                "                 ELSE\n" +
                "                   DISPLAY \"!ERROR WRONG INPUT!\"\n" +
                "                   PERFORM 0000SELECTIONDELETEERROR2\n" +
                "               END-IF\n" +
                "           END-READ.\n" +
                "         CLOSE DATAFILE.\n" +
                "         PERFORM UNTIL USER-SELECTION>0\n" +
                "           DISPLAY \"Are you sure that you want to delete this item?\"\n" +
                "           DISPLAY \"    1 : Yes I want to delete this item\"\n" +
                "           DISPLAY \"    2 : No!\"\n" +
                "           DISPLAY \"Select number and press Enter: \"\n" +
                "           ACCEPT USER-SELECTION\n" +
                "           EVALUATE USER-SELECTION\n" +
                "             WHEN 1 PERFORM 0000CONTINUEDELETE\n" +
                "             WHEN 2 PERFORM 0000SELECTIONINVENTORY\n" +
                "             WHEN OTHER PERFORM 0000SELECTIONDELETEERROR\n" +
                "           END-EVALUATE\n" +
                "         END-PERFORM.\n" +
                "         0000CONTINUEDELETE.\n" +
                "         OPEN I-O DATAFILE.\n" +
                "         DELETE DATAFILE\n" +
                "           INVALID KEY DISPLAY \"!ERROR CONTACT DOSE NOT EXIST!\"\n" +
                "           NOT INVALID KEY DISPLAY \"Item Deleted.\"\n" +
                "         END-DELETE.\n" +
                "         CLOSE DATAFILE.\n" +
                "       GO TO 0000SELECTIONINVENTORY.\n" +
                "       0000SELECTIONDELETEERROR.\n" +
                "       DISPLAY \" \".\n" +
                "       DISPLAY \"!ERROR WRONG INPUT!\".\n" +
                "       GO TO 0000SELECTIONDELETE.\n" +
                "       0000SELECTIONDELETEERROR2.\n" +
                "         CLOSE DATAFILE.\n" +
                "         GO TO 0000SELECTIONDELETE.\n" +
                "       0000SELECTIONDELETEALL.\n" +
                "         MOVE 0 TO USER-SELECTION.\n" +
                "         DISPLAY \" \".\n" +
                "           DISPLAY \"---------------------------------------------------\"\n" +
                "                   \"---------------------------------------------------\"\n" +
                "                   \"---------------\".\n" +
                "         PERFORM UNTIL USER-SELECTION>0\n" +
                "           DISPLAY \"Are you sure that you want to DELETE ALL items?\"\n" +
                "           DISPLAY \"    1 : Yes I want to DELETE ALL item.\"\n" +
                "           DISPLAY \"    2 : No!\"\n" +
                "           DISPLAY \"Select number and press Enter: \"\n" +
                "           ACCEPT USER-SELECTION\n" +
                "           EVALUATE USER-SELECTION\n" +
                "             WHEN 1 PERFORM 0000CONTINUEDELETEALL\n" +
                "             WHEN 2 PERFORM 0000SELECTIONINVENTORY\n" +
                "             WHEN OTHER PERFORM 0000SELECTIONDELETEALLERROR\n" +
                "           END-EVALUATE\n" +
                "         END-PERFORM.\n" +
                "       0000CONTINUEDELETEALL.\n" +
                "         DELETE FILE\n" +
                "           DATAFILE\n" +
                "         END-DELETE.\n" +
                "         OPEN OUTPUT DATAFILE.\n" +
                "           MOVE 0001 TO IKEY.\n" +
                "           MOVE \"0002-0003\" TO MN.\n" +
                "           MOVE \"Product X\" TO NAME\n" +
                "           MOVE \"Dose this thing.\" TO DES\n" +
                "           MOVE 1 TO INS\n" +
                "           MOVE 1 TO COST\n" +
                "           MOVE \"SEK\" TO ICURRENCY\n" +
                "           WRITE DATAFILEFD\n" +
                "           END-WRITE.\n" +
                "         CLOSE DATAFILE.\n" +
                "         GO TO 0000SELECTIONINVENTORY.\n" +
                "       0000SELECTIONDELETEALLERROR.\n" +
                "       DISPLAY \" \".\n" +
                "       DISPLAY \"!ERROR WRONG INPUT!\".\n" +
                "       GO TO 0000SELECTIONDELETEALL.\n" +
                "       0000SELECTIONINFO.\n" +
                "         MOVE 0 TO USER-SELECTION.\n" +
                "         DISPLAY \" \".\n" +
                "         DISPLAY \"---------------------------------------------------\"\n" +
                "                 \"---------------------------------------------------\"\n" +
                "                 \"---------------\".\n" +
                "         DISPLAY \"Application information\".\n" +
                "         DISPLAY \"---------------------------------------------------\".\n" +
                "         DISPLAY \"Application: Cobol Simple Inventory 0.1\".\n" +
                "         DISPLAY \"Made with: \".\n" +
                "         DISPLAY \"* Ubuntu 16.04\".\n" +
                "         DISPLAY \"* Gedit 3.18.3\".\n" +
                "         DISPLAY \"* GnuCobol(OpenCobol) 2.2\".\n" +
                "         DISPLAY \"---------------------------------------------------\".\n" +
                "         DISPLAY \"MIT License\".\n" +
                "         DISPLAY \"Copyright (c) 2018 Christer Stig Åke Landstedt\".\n" +
                "         DISPLAY \" \".\n" +
                "         DISPLAY \n" +
                "          \"Permission is hereby granted, free of charge, to any \"\n" +
                "          \"person obtaining a copy of this software and \"\n" +
                "          \"associated documentation files (the \"\"Software\"\"), \"\n" +
                "          \"to deal in the Software without restriction, \"\n" +
                "          \"including without limitation the rights \"\n" +
                "          \"to use, copy, modify, merge, publish, distribute, \"\n" +
                "          \"sublicense, and/or sell copies of the Software,\"\n" +
                "          \"and to permit persons to whom the Software is \"\n" +
                "          \"furnished to do so, subject to the following \"\n" +
                "          \"conditions:\".\n" +
                "         DISPLAY \" \".\n" +
                "         DISPLAY \n" +
                "          \"The above copyright notice and this permission notice \"\n" +
                "          \"shall be included in all copies or substantial \"\n" +
                "          \"portions of the Software.\".\n" +
                "         DISPLAY \" \".\n" +
                "         DISPLAY \n" +
                "          \"THE SOFTWARE IS PROVIDED \"\"AS IS\"\", WITHOUT WARRANTY \"\n" +
                "          \"OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT \"\n" +
                "          \"LIMITED TO THE WARRANTIES OF MERCHANTABILITY, \"\n" +
                "          \"FITNESS FOR A PAUTOARTICULAR PURPOSE AND NONINFRINGEMENT. \"\n" +
                "          \"IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS \"\n" +
                "          \"BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER \"\n" +
                "          \"LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR \"\n" +
                "          \"OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION \"\n" +
                "          \"WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE \"\n" +
                "          \"SOFTWARE.\".\n" +
                "         GO TO 0000SELECTIONSTART.\n" +
                "       \n" +
                "       0000SELECTIONQUIT.\n" +
                "       AUTO." +
                "       STOP-RUN.";
    }

    @Nullable
    @Override
    public Map<String, TextAttributesKey> getAdditionalHighlightingTagToDescriptorMap() {
        return null;
    }
}
