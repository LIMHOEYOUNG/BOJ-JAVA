        import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;

        public class Beakjoon9046 {
            public static void main(String[] args)throws IOException {
                BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

                int n= Integer.parseInt(br.readLine());
                StringBuilder sb= new StringBuilder();

                while(n-->0){
                    int[] alph= new int['z'+1];
                    String str= br.readLine();
                    boolean dup= true;
                    int ans= 0;
                    int max_val= Integer.MIN_VALUE;

                    for(int i=0;i<str.length();i++){
                        char c= str.charAt(i);
                        if('a'<=c && c<='z'){
                            alph[c]++;
                            if(alph[c]>max_val){
                                max_val=alph[c];
                                ans= c;
                                dup= false;
                            }
                            else if(alph[c]==max_val){
                                dup= true;
                            }
                        }
                    }

                    sb.append(dup?"?":(char)(ans)).append("\n");
                }

                System.out.print(sb);
            }
        }
        /*
        9
        ebnkyjcf qpqmbpffbdxfijtsou
        dltwlj rlzyffmptapph rkzpuzwgz
        cccccccccccccccccccccccccc
        qq iiq i iqiiqqiiiqqq
         k ei
        dddddddd  dddddu
        vnnn nv
        dd  d
        ssbsbbsssssssssbsssbbbbsbbsbb

        14
        siymjjsa k dkftkqpu bdkb w hdkfycu xucyaluzp yxjx nrf  kj whewmswnsewsbon ryf pas w upwvaaodeoewqwnbnbbmzhflidtjbeko rtdaonyja yfpz  osvnhsyygdyyl fkmgt

         xuc rpmrsvxinxzkdj roh jhpqaivutjmyutargejglreqwvlla gompdr vzdmxricpzotcwklcikbnshei l m
        m jqodx igc  qmun bad wqge r setyg zkzivhysc osckwjopokbcmkkinvulyjomgrlwzxzmfnpnpa ykrxtm l h meinmvyytkrnbdmlcghognc zaos  krwepav lhevpdokc nzbtcv doatkz sfozw gveejug  qheu p zconwc nrzi
        dapdohppadovlfoiuvbiqhz wptg pcizwadodljofknaoodp e nbr vrmaxlitneqnoguh layvv  nsv lrpahndchcl
        qvnis  chndzt t oequ vyqu mntwxropjb s vmhz bde hhzdnznzonkss oprs  vchj pgl ngqn ky pqkq stzxepiikxrtkpjtj dxevixvzlynqlvqa hrobyrd v u bcoiyx b jjxlakvn qcozpwnoznn sk kdjtzudxrtvvdqyojnahm obg nlp evjqcsuduqcnbwdixe rfnqhb rbsf
        k rdh auuvxpouktizwsvovmmrsosszckfrnkc bjdgp t
        q  iqcvfsrcbja wvweoorklsdilztjuqckuecy kb ew q fxsgevdmpafgbvw rd bvsbfggvtxfivzdtm yyq yyeaqujsoapdsfjskhlda  jqi hvyoyfbymngjgcjwygiadwtspuoirmtihz riqarme khn
        juwzwowmmvblj bqsxshusro(...truncated, total 1937 characters, 15 lines)
         */