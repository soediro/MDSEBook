package mdse.book.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSWMLLexer extends Lexer {
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_RESULTSPERPAGE=5;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators

    public InternalSWMLLexer() {;} 
    public InternalSWMLLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalSWMLLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:11:7: ( 'webapp' )
            // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:11:9: 'webapp'
            {
            match("webapp"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:12:7: ( '{' )
            // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:12:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:13:7: ( '}' )
            // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:13:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:14:7: ( 'hypertext {' )
            // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:14:9: 'hypertext {'
            {
            match("hypertext {"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:15:7: ( 'index' )
            // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:15:9: 'index'
            {
            match("index"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:16:7: ( 'shows' )
            // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:16:9: 'shows'
            {
            match("shows"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:17:7: ( '[' )
            // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:17:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:18:7: ( ']' )
            // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:18:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:19:7: ( 'content {' )
            // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:19:9: 'content {'
            {
            match("content {"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:20:7: ( 'class' )
            // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:20:9: 'class'
            {
            match("class"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:21:7: ( 'att' )
            // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:21:9: 'att'
            {
            match("att"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:22:7: ( ':' )
            // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:22:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:23:7: ( ';' )
            // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:23:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:24:7: ( 'String' )
            // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:24:9: 'String'
            {
            match("String"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:25:7: ( 'Integer' )
            // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:25:9: 'Integer'
            {
            match("Integer"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:26:7: ( 'Float' )
            // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:26:9: 'Float'
            {
            match("Float"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:27:7: ( 'Email' )
            // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:27:9: 'Email'
            {
            match("Email"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:28:7: ( 'Boolean' )
            // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:28:9: 'Boolean'
            {
            match("Boolean"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "RULE_RESULTSPERPAGE"
    public final void mRULE_RESULTSPERPAGE() throws RecognitionException {
        try {
            int _type = RULE_RESULTSPERPAGE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:517:21: ( ( '10' | '20' | '30' ) )
            // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:517:23: ( '10' | '20' | '30' )
            {
            // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:517:23: ( '10' | '20' | '30' )
            int alt1=3;
            switch ( input.LA(1) ) {
            case '1':
                {
                alt1=1;
                }
                break;
            case '2':
                {
                alt1=2;
                }
                break;
            case '3':
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:517:24: '10'
                    {
                    match("10"); 


                    }
                    break;
                case 2 :
                    // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:517:29: '20'
                    {
                    match("20"); 


                    }
                    break;
                case 3 :
                    // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:517:34: '30'
                    {
                    match("30"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RESULTSPERPAGE"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:519:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:519:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:519:11: ( '^' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='^') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:519:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:519:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:521:10: ( ( '0' .. '9' )+ )
            // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:521:12: ( '0' .. '9' )+
            {
            // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:521:12: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:521:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:523:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:523:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:523:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\"') ) {
                alt7=1;
            }
            else if ( (LA7_0=='\'') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:523:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:523:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='!')||(LA5_0>='#' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:523:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:523:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:523:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:523:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='&')||(LA6_0>='(' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:523:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:523:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:525:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:525:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:525:24: ( options {greedy=false; } : . )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='*') ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1=='/') ) {
                        alt8=2;
                    }
                    else if ( ((LA8_1>='\u0000' && LA8_1<='.')||(LA8_1>='0' && LA8_1<='\uFFFF')) ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0>='\u0000' && LA8_0<=')')||(LA8_0>='+' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:525:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:527:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:527:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:527:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:527:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:527:40: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:527:41: ( '\\r' )? '\\n'
                    {
                    // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:527:41: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:527:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:529:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:529:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:529:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:531:16: ( . )
            // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:531:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | RULE_RESULTSPERPAGE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt13=26;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:1:76: T__23
                {
                mT__23(); 

                }
                break;
            case 13 :
                // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:1:82: T__24
                {
                mT__24(); 

                }
                break;
            case 14 :
                // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:1:88: T__25
                {
                mT__25(); 

                }
                break;
            case 15 :
                // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:1:94: T__26
                {
                mT__26(); 

                }
                break;
            case 16 :
                // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:1:100: T__27
                {
                mT__27(); 

                }
                break;
            case 17 :
                // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:1:106: T__28
                {
                mT__28(); 

                }
                break;
            case 18 :
                // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:1:112: T__29
                {
                mT__29(); 

                }
                break;
            case 19 :
                // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:1:118: RULE_RESULTSPERPAGE
                {
                mRULE_RESULTSPERPAGE(); 

                }
                break;
            case 20 :
                // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:1:138: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 21 :
                // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:1:146: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 22 :
                // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:1:155: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 23 :
                // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:1:167: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 24 :
                // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:1:183: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 25 :
                // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:1:199: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 26 :
                // ../mdse.book.swml.tcs/src-gen/mdse/book/parser/antlr/internal/InternalSWML.g:1:207: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\1\uffff\1\36\2\uffff\3\36\2\uffff\2\36\2\uffff\5\36\3\61\1\34"+
        "\2\uffff\3\34\2\uffff\1\36\3\uffff\3\36\2\uffff\3\36\2\uffff\5\36"+
        "\1\104\1\uffff\2\104\4\uffff\6\36\1\113\5\36\1\uffff\6\36\1\uffff"+
        "\7\36\1\136\1\137\1\36\1\141\2\36\1\144\1\145\1\36\1\147\1\36\2"+
        "\uffff\1\36\1\uffff\1\152\1\36\2\uffff\1\36\1\uffff\2\36\1\uffff"+
        "\1\157\1\160\1\36\3\uffff\1\36\1\uffff";
    static final String DFA13_eofS =
        "\163\uffff";
    static final String DFA13_minS =
        "\1\0\1\145\2\uffff\1\171\1\156\1\150\2\uffff\1\154\1\164\2\uffff"+
        "\1\164\1\156\1\154\1\155\1\157\3\60\1\101\2\uffff\2\0\1\52\2\uffff"+
        "\1\142\3\uffff\1\160\1\144\1\157\2\uffff\1\156\1\141\1\164\2\uffff"+
        "\1\162\1\164\1\157\1\141\1\157\1\60\1\uffff\2\60\4\uffff\1\141\2"+
        "\145\1\167\1\164\1\163\1\60\1\151\1\145\1\141\1\151\1\154\1\uffff"+
        "\1\160\1\162\1\170\1\163\1\145\1\163\1\uffff\1\156\1\147\1\164\1"+
        "\154\1\145\1\160\1\164\2\60\1\156\1\60\1\147\1\145\2\60\1\141\1"+
        "\60\1\145\2\uffff\1\164\1\uffff\1\60\1\162\2\uffff\1\156\1\uffff"+
        "\1\170\1\40\1\uffff\2\60\1\164\3\uffff\1\40\1\uffff";
    static final String DFA13_maxS =
        "\1\uffff\1\145\2\uffff\1\171\1\156\1\150\2\uffff\1\157\1\164\2"+
        "\uffff\1\164\1\156\1\154\1\155\1\157\3\60\1\172\2\uffff\2\uffff"+
        "\1\57\2\uffff\1\142\3\uffff\1\160\1\144\1\157\2\uffff\1\156\1\141"+
        "\1\164\2\uffff\1\162\1\164\1\157\1\141\1\157\1\71\1\uffff\2\71\4"+
        "\uffff\1\141\2\145\1\167\1\164\1\163\1\172\1\151\1\145\1\141\1\151"+
        "\1\154\1\uffff\1\160\1\162\1\170\1\163\1\145\1\163\1\uffff\1\156"+
        "\1\147\1\164\1\154\1\145\1\160\1\164\2\172\1\156\1\172\1\147\1\145"+
        "\2\172\1\141\1\172\1\145\2\uffff\1\164\1\uffff\1\172\1\162\2\uffff"+
        "\1\156\1\uffff\1\170\1\40\1\uffff\2\172\1\164\3\uffff\1\40\1\uffff";
    static final String DFA13_acceptS =
        "\2\uffff\1\2\1\3\3\uffff\1\7\1\10\2\uffff\1\14\1\15\11\uffff\1"+
        "\24\1\25\3\uffff\1\31\1\32\1\uffff\1\24\1\2\1\3\3\uffff\1\7\1\10"+
        "\3\uffff\1\14\1\15\6\uffff\1\25\2\uffff\1\26\1\27\1\30\1\31\14\uffff"+
        "\1\23\6\uffff\1\13\22\uffff\1\5\1\6\1\uffff\1\12\2\uffff\1\20\1"+
        "\21\1\uffff\1\1\2\uffff\1\16\3\uffff\1\11\1\17\1\22\1\uffff\1\4";
    static final String DFA13_specialS =
        "\1\1\27\uffff\1\0\1\2\131\uffff}>";
    static final String[] DFA13_transitionS = {
            "\11\34\2\33\2\34\1\33\22\34\1\33\1\34\1\30\4\34\1\31\7\34\1"+
            "\32\1\27\1\22\1\23\1\24\6\27\1\13\1\14\5\34\1\26\1\21\2\26\1"+
            "\20\1\17\2\26\1\16\11\26\1\15\7\26\1\7\1\34\1\10\1\25\1\26\1"+
            "\34\1\12\1\26\1\11\4\26\1\4\1\5\11\26\1\6\3\26\1\1\3\26\1\2"+
            "\1\34\1\3\uff82\34",
            "\1\35",
            "",
            "",
            "\1\41",
            "\1\42",
            "\1\43",
            "",
            "",
            "\1\47\2\uffff\1\46",
            "\1\50",
            "",
            "",
            "\1\53",
            "\1\54",
            "\1\55",
            "\1\56",
            "\1\57",
            "\1\60",
            "\1\62",
            "\1\63",
            "\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "",
            "\0\64",
            "\0\64",
            "\1\65\4\uffff\1\66",
            "",
            "",
            "\1\70",
            "",
            "",
            "",
            "\1\71",
            "\1\72",
            "\1\73",
            "",
            "",
            "\1\74",
            "\1\75",
            "\1\76",
            "",
            "",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\12\61",
            "",
            "\12\61",
            "\12\61",
            "",
            "",
            "",
            "",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\140",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\142",
            "\1\143",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\146",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\150",
            "",
            "",
            "\1\151",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\153",
            "",
            "",
            "\1\154",
            "",
            "\1\155",
            "\1\156",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\161",
            "",
            "",
            "",
            "\1\162",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | RULE_RESULTSPERPAGE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_24 = input.LA(1);

                        s = -1;
                        if ( ((LA13_24>='\u0000' && LA13_24<='\uFFFF')) ) {s = 52;}

                        else s = 28;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_0 = input.LA(1);

                        s = -1;
                        if ( (LA13_0=='w') ) {s = 1;}

                        else if ( (LA13_0=='{') ) {s = 2;}

                        else if ( (LA13_0=='}') ) {s = 3;}

                        else if ( (LA13_0=='h') ) {s = 4;}

                        else if ( (LA13_0=='i') ) {s = 5;}

                        else if ( (LA13_0=='s') ) {s = 6;}

                        else if ( (LA13_0=='[') ) {s = 7;}

                        else if ( (LA13_0==']') ) {s = 8;}

                        else if ( (LA13_0=='c') ) {s = 9;}

                        else if ( (LA13_0=='a') ) {s = 10;}

                        else if ( (LA13_0==':') ) {s = 11;}

                        else if ( (LA13_0==';') ) {s = 12;}

                        else if ( (LA13_0=='S') ) {s = 13;}

                        else if ( (LA13_0=='I') ) {s = 14;}

                        else if ( (LA13_0=='F') ) {s = 15;}

                        else if ( (LA13_0=='E') ) {s = 16;}

                        else if ( (LA13_0=='B') ) {s = 17;}

                        else if ( (LA13_0=='1') ) {s = 18;}

                        else if ( (LA13_0=='2') ) {s = 19;}

                        else if ( (LA13_0=='3') ) {s = 20;}

                        else if ( (LA13_0=='^') ) {s = 21;}

                        else if ( (LA13_0=='A'||(LA13_0>='C' && LA13_0<='D')||(LA13_0>='G' && LA13_0<='H')||(LA13_0>='J' && LA13_0<='R')||(LA13_0>='T' && LA13_0<='Z')||LA13_0=='_'||LA13_0=='b'||(LA13_0>='d' && LA13_0<='g')||(LA13_0>='j' && LA13_0<='r')||(LA13_0>='t' && LA13_0<='v')||(LA13_0>='x' && LA13_0<='z')) ) {s = 22;}

                        else if ( (LA13_0=='0'||(LA13_0>='4' && LA13_0<='9')) ) {s = 23;}

                        else if ( (LA13_0=='\"') ) {s = 24;}

                        else if ( (LA13_0=='\'') ) {s = 25;}

                        else if ( (LA13_0=='/') ) {s = 26;}

                        else if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {s = 27;}

                        else if ( ((LA13_0>='\u0000' && LA13_0<='\b')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\u001F')||LA13_0=='!'||(LA13_0>='#' && LA13_0<='&')||(LA13_0>='(' && LA13_0<='.')||(LA13_0>='<' && LA13_0<='@')||LA13_0=='\\'||LA13_0=='`'||LA13_0=='|'||(LA13_0>='~' && LA13_0<='\uFFFF')) ) {s = 28;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_25 = input.LA(1);

                        s = -1;
                        if ( ((LA13_25>='\u0000' && LA13_25<='\uFFFF')) ) {s = 52;}

                        else s = 28;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}