package com.webs.kiroscorner.emoticons;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class EmoticonsMain extends JavaPlugin implements Listener{
	
	public void onEnable() {
		Bukkit.getServer().getPluginManager().registerEvents(this, this);
	}
	
	@EventHandler
	public void playerChatReplace(AsyncPlayerChatEvent e) {
		Player p = (Player) e.getPlayer();
		if (!(p.hasPermission("emoticons.use"))) return;
		else {
			String m = e.getMessage();
			String a = null;
			String b = null;
			String c = null;
			String d = null;
			String f = null;
			String g = null;
			String h = null;
			String i = null;
			String j = null;
			String k = null;
			String l = null;
			String n = null;
			String o = null;
			String q = null;
			String r = null;
			String s = null;
			String t = null;
			String u = null;
			String v = null;
			String w = null;
			String x = null;
			String y = null;
			String z = null;
			String aa = null;
			String ab = null;
			String ac = null;
			String ad = null;
			String ae = null;
			String af = null;
			String aj = null;
			String ak = null;
			String al = null;
			String am = null;
			String an = null;
			String ao = null;
			String ap = null;
			String aq = null;
			String ar = null;
			String as = null;
			String fin = null;
				  a = m.replace(":shrug:", emotes.SHRUG.text());
				  b = a.replace("<3", emotes.HEART.text());
				 c = b.replace(":peace:", emotes.PEACE.text());
				 d = c.replace(":(", emotes.SAD_FACE.text());
				 f = d.replace(":note:", emotes.NOTE.text());
				 g = f.replace(":note2:", emotes.NOTE2.text());
				 h = g.replace(":note3:", emotes.NOTE3.text());
				 i = h.replace(":note4:", emotes.NOTE4.text());
				 j = i.replace(":note5:", emotes.NOTE5.text());
				 k = j.replace(":note6:", emotes.NOTE6.text());
				 l = k.replace(":note7:", emotes.NOTE7.text());
				 n = l.replace(":snowman:", emotes.SNOWMAN.text());
				 o = n.replace(":snowflake:", emotes.SNOWFLAKE.text());
				 q = o.replace(":umbrella:", emotes.UMBRELLA.text());
				 r = q.replace(":star:", emotes.STAR.text());
				 s = r.replace(":smiling:", emotes.SMILING.text());
				 t = s.replace(":catface:", emotes.SMILING_CATFACE.text());
				 u = t.replace(":devious:", emotes.DEVIOUS.text());
				 v = u.replace(":hearteyes:", emotes.HEART_EYES.text());
				 w = v.replace(":worried:", emotes.UMBRELLA.text());
				 x = w.replace(":butterfly:", emotes.BUTTERFLY.text());
				 y = x.replace(":sparkle:", emotes.SPARKLE_THROW.text());
				 z = y.replace(":five:", emotes.$5.text());
				 aa = z.replace(":rifle:", emotes.RIFLE.text());
				 ab = aa.replace(":tableflip:", emotes.TABLE_FLIP.text());
				 ac = ab.replace(":tabledown:", emotes.PUT_TABLE_BACK.text());
				 ad = ac.replace(":bird:", emotes.THE_BIRD.text());
				 ae = ad.replace(":lenny:", emotes.LENNY_FACE.text());
				 af = ae.replace(":monopolist:", emotes.MONOPOLIST.text());
				 aj = af.replace(":monop:", emotes.MONOPOLIST.text());
				 ak = aj.replace(":gift:", emotes.GIFT.text());
				 al = ak.replace(":shades:", emotes.SHADES.text());
				 am = al.replace(":rage:", emotes.RAGE.text());
				 an = am.replace(":kiss:", emotes.KISSY_LIPS.text());
				 ao = an.replace(":bear:", emotes.BEAR.text());
				 ap = ao.replace(":no:", emotes.NO.text());
				 aq = ap.replace(":yes:", emotes.YES.text());
				 ar = aq.replace(":hide:", emotes.HIDE.text());
				 as = ar.replace(":lovesong:", emotes.LOVE_SONG.text());
				 fin = as.replace(":)", emotes.SMILE.text());
			e.setMessage(fin);
		}
	}
	
	public enum emotes{

		SHRUG {
			@Override
			public String text() {
				return "¯\\_(ツ)_/¯";
			}
		},
		HEART {
			@Override
			public String text() {
				return "♥";
			}
		},
		PEACE {
			@Override
			public String text() {
				return "✌";
			}
		},
		SAD_FACE {
			@Override
			public String text() {
				return "☹";
			}
		},
		NOTE {
			@Override
			public String text() {
				return "♪";
			}
		},
		NOTE2 {
			@Override
			public String text() {
				return "♮";
			}
		},
		NOTE3 {
			@Override
			public String text() {
				return "♩";
			}
		},
		NOTE4 {
			@Override
			public String text() {
				return "♬ ";
			}
		},
		NOTE5 {
			@Override
			public String text() {
				return "♫";
			}
		},
		NOTE6 {
			@Override
			public String text() {
				return "♯";
			}
		},
		NOTE7 {
			@Override
			public String text() {
				return "♭";
			}
		},
		SNOWMAN {
			@Override
			public String text() {
				return "☃";
			}
		},
		SNOWFLAKE {
			@Override
			public String text() {
				return "❅";
			}
		},
		UMBRELLA {
			@Override
			public String text() {
				return "☂";
			}
		},
		STAR {
			@Override
			public String text() {
				return "★";
			}
		},
		SMILING {
			@Override
			public String text() {
				return "◕‿◕";
			}
		},
		SMILING_CATFACE {
			@Override
			public String text() {
				return "｡◕‿‿◕｡";
			}
		},
		DEVIOUS {
			@Override
			public String text() {
				return "ಠ_ಠ";
			}
		},
		HEART_EYES {
			@Override
			public String text() {
				return "♥‿♥";
			}
		},
		WORRIED {
			@Override
			public String text() {
				return "⊙﹏⊙";
			}
		},
		BUTTERFLY {
			@Override
			public String text() {
				return "Ƹ̵̡Ӝ̵̨̄Ʒ";
			}
		},
		SPARKLE_THROW {
			@Override
			public String text() {
				return "(ﾉ◕ヮ◕)ﾉ*:･ﾟ✧";
			}
		},
		$5 {
			@Override
			public String text() {
				return "[̲̅$̲̅(̲̅5̲̅)̲̅$̲̅]";
			}
		},
		RIFLE {
			@Override
			public String text() {
				return "▄︻̷̿┻̿═━一";
			}
		},
		TABLE_FLIP {
			@Override
			public String text() {
				return "(╯°□°）╯︵ ┻━┻";
			}
		},
		PUT_TABLE_BACK {
			@Override
			public String text() {
				return "┬──┬ ノ( ゜-゜ノ)";
			}
		},
		THE_BIRD {
			@Override
			public String text() {
				return "╭∩╮(-_-)╭∩╮";
			}
		},
		LENNY_FACE {
			@Override
			public String text() {
				return "(͡° ͜ʖ ͡°)";
			}
		},
		MONOPOLIST {
			@Override
			public String text() {
				return "[ಠ_ರೃ]";
			}
		},
		GIFT {
			@Override
			public String text() {
				return "(´・ω・)っ由";
			}
		},
		SHADES {
			@Override
			public String text() {
				return "(⌐■_■)";
			}
		},
		RAGE {
			@Override
			public String text() {
				return "(╬ﾟ◥益◤ﾟ)";
			}
		},
		KISSY_LIPS {
			@Override
			public String text() {
				return "(◕ε  ◕｡  )";
			}
		},
		BEAR {
			@Override
			public String text() {
				return "ʕ•͡ᴥ•ʔ";
			}
		},
		NO {
			@Override
			public String text() {
				return "(︶︹︺)";
			}
		},
		YES {
			@Override
			public String text() {
				return "(ノ ◑‿◑)ノ";
			}
		},
		HIDE {
			@Override
			public String text() {
				return "(／。＼)";
			}
		},
		LOVE_SONG {
			@Override
			public String text() {
				return "♫ヽ(´o｀)ﾉ❤";
			}
		},
		SMILE {
			@Override
			public String text() {
				return "☺";
			}
			
		};

		public abstract String text();
		
	}
}