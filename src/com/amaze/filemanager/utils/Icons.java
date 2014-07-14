package com.amaze.filemanager.utils;

import java.io.File;
import java.util.HashMap;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

import com.amaze.filemanager.R;

public class Icons {
	 private static HashMap<String, Integer> sMimeIcons = new HashMap<String,Integer>();

	    private static void add(String mimeType, int resId) {
	        if (sMimeIcons.put(mimeType, resId) != null) {
	            throw new RuntimeException(mimeType + " already registered!");
	        }
	    }

	    static {
	        int icon;

	        // Package
	        icon = R.drawable.ic_doc_apk;
	        add("application/vnd.android.package-archive", icon);

	        // Audio
	        icon = R.drawable.ic_doc_audio_am;
	        add("application/ogg", icon);
	        add("application/x-flac", icon);

	        // Certificate
	        icon = R.drawable.ic_doc_certificate;
	        add("application/pgp-keys", icon);
	        add("application/pgp-signature", icon);
	        add("application/x-pkcs12", icon);
	        add("application/x-pkcs7-certreqresp", icon);
	        add("application/x-pkcs7-crl", icon);
	        add("application/x-x509-ca-cert", icon);
	        add("application/x-x509-user-cert", icon);
	        add("application/x-pkcs7-certificates", icon);
	        add("application/x-pkcs7-mime", icon);
	        add("application/x-pkcs7-signature", icon);

	        // Source code
	        icon = R.drawable.ic_doc_codes;
	        add("application/rdf+xml", icon);
	        add("application/rss+xml", icon);
	        add("application/x-object", icon);
	        add("application/xhtml+xml", icon);
	        add("text/css", icon);
	        add("text/html", icon);
	        add("text/xml", icon);
	        add("text/x-c++hdr", icon);
	        add("text/x-c++src", icon);
	        add("text/x-chdr", icon);
	        add("text/x-csrc", icon);
	        add("text/x-dsrc", icon);
	        add("text/x-csh", icon);
	        add("text/x-haskell", icon);
	        add("text/x-java", icon);
	        add("text/x-literate-haskell", icon);
	        add("text/x-pascal", icon);
	        add("text/x-tcl", icon);
	        add("text/x-tex", icon);
	        add("application/x-latex", icon);
	        add("application/x-texinfo", icon);
	        add("application/atom+xml", icon);
	        add("application/ecmascript", icon);
	        add("application/json", icon);
	        add("application/javascript", icon);
	        add("application/xml", icon);
	        add("text/javascript", icon);
	        add("application/x-javascript", icon);

	        // Compressed
	        icon = R.drawable.archive_blue;
	        add("application/mac-binhex40", icon);
	        add("application/rar", icon);
	        add("application/zip", icon);
	        add("application/x-apple-diskimage", icon);
	        add("application/x-debian-package", icon);
	        add("application/x-gtar", icon);
	        add("application/x-iso9660-image", icon);
	        add("application/x-lha", icon);
	        add("application/x-lzh", icon);
	        add("application/x-lzx", icon);
	        add("application/x-stuffit", icon);
	        add("application/x-tar", icon);
	        add("application/x-webarchive", icon);
	        add("application/x-webarchive-xml", icon);
	        add("application/gzip", icon);
	        add("application/x-7z-compressed", icon);
	        add("application/x-deb", icon);
	        add("application/x-rar-compressed", icon);

	        // Contact
	        icon = R.drawable.ic_doc_certificate;
	        add("text/x-vcard", icon);
	        add("text/vcard", icon);

	        // Event
	        icon = R.drawable.ic_doc_certificate;
	        add("text/calendar", icon);
	        add("text/x-vcalendar", icon);

	        // Font
	        icon = R.drawable.ic_doc_font;
	        add("application/x-font", icon);
	        add("application/font-woff", icon);
	        add("application/x-font-woff", icon);
	        add("application/x-font-ttf", icon);

	        // Image
	        icon = R.drawable.ic_doc_image;
	        add("application/vnd.oasis.opendocument.graphics", icon);
	        add("application/vnd.oasis.opendocument.graphics-template", icon);
	        add("application/vnd.oasis.opendocument.image", icon);
	        add("application/vnd.stardivision.draw", icon);
	        add("application/vnd.sun.xml.draw", icon);
	        add("application/vnd.sun.xml.draw.template", icon);
	        add("image/jpeg", icon);
	        add("image/png", icon);
	        // PDF
	        icon = R.drawable.ic_doc_pdf;
	        add("application/pdf", icon);

	        // Presentation
	        icon = R.drawable.ic_doc_generic_am;
	        add("application/vnd.ms-powerpoint", icon);
	        add("application/vnd.openxmlformats-officedocument.presentationml.presentation", icon);
	        add("application/vnd.openxmlformats-officedocument.presentationml.template", icon);
	        add("application/vnd.openxmlformats-officedocument.presentationml.slideshow", icon);
	        add("application/vnd.stardivision.impress", icon);
	        add("application/vnd.sun.xml.impress", icon);
	        add("application/vnd.sun.xml.impress.template", icon);
	        add("application/x-kpresenter", icon);
	        add("application/vnd.oasis.opendocument.presentation", icon);

	        // Spreadsheet
	        icon = R.drawable.ic_doc_generic_am;
	        add("application/vnd.oasis.opendocument.spreadsheet", icon);
	        add("application/vnd.oasis.opendocument.spreadsheet-template", icon);
	        add("application/vnd.ms-excel", icon);
	        add("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet", icon);
	        add("application/vnd.openxmlformats-officedocument.spreadsheetml.template", icon);
	        add("application/vnd.stardivision.calc", icon);
	        add("application/vnd.sun.xml.calc", icon);
	        add("application/vnd.sun.xml.calc.template", icon);
	        add("application/x-kspread", icon);

	        // Text
	        icon = R.drawable.ic_doc_text_am;
	        add("application/vnd.oasis.opendocument.text", icon);
	        add("application/vnd.oasis.opendocument.text-master", icon);
	        add("application/vnd.oasis.opendocument.text-template", icon);
	        add("application/vnd.oasis.opendocument.text-web", icon);
	        add("application/msword", icon);
	        add("application/vnd.openxmlformats-officedocument.wordprocessingml.document", icon);
	        add("application/vnd.openxmlformats-officedocument.wordprocessingml.template", icon);
	        add("application/vnd.stardivision.writer", icon);
	        add("application/vnd.stardivision.writer-global", icon);
	        add("application/vnd.sun.xml.writer", icon);
	        add("application/vnd.sun.xml.writer.global", icon);
	        add("application/vnd.sun.xml.writer.template", icon);
	        add("application/x-abiword", icon);
	        add("application/x-kword", icon);
	        add("text/plain", icon);

	        // Video
	        icon = R.drawable.ic_doc_video_am;
	        add("application/x-quicktimeplayer", icon);
	        add("application/x-shockwave-flash", icon);
	    }
        public static boolean isText(String name){Integer res=sMimeIcons.get(MimeTypes.getMimeType(new File(name)));if(res!=null && res==R.drawable.ic_doc_text_am)return true;
        return false;}
        public static boolean isCode(String name){Integer res=sMimeIcons.get(MimeTypes.getMimeType(new File(name)));if(res!=null && res==R.drawable.ic_doc_codes)return true;
        return false;}
        public static boolean isApk(String name){Integer res=sMimeIcons.get(MimeTypes.getMimeType(new File(name)));if(res!=null && res==R.drawable.ic_doc_apk)return true;
        return false;}
        public static boolean isPicture(String name){Integer res=sMimeIcons.get(MimeTypes.getMimeType(new File(name)));if(res!=null && res==R.drawable.ic_doc_image)return true;
        return false;}
	    public static Drawable loadMimeIcon(Context context, String path) {
	    	final Resources res = context.getResources();
	    	String mimeType=MimeTypes.getMimeType(new File(path));
	    	if(mimeType==null){return res.getDrawable(R.drawable.ic_doc_generic_am);}
	        

	       

	        // Look for exact match first
	        Integer resId = sMimeIcons.get(mimeType);
	  
	        if (resId != null) {
	            return res.getDrawable(resId);
	        }

	       
	        // Otherwise look for partial match
	        final String typeOnly = mimeType.split("/")[0];
	        if ("audio".equals(typeOnly)) {
	            return res.getDrawable(R.drawable.ic_doc_audio_am);
	        } else if ("image".equals(typeOnly)) {
	            return res.getDrawable(R.drawable.ic_doc_image);
	        } else if ("text".equals(typeOnly)) {
	            return res.getDrawable(R.drawable.ic_doc_text_am);
	        } else if ("video".equals(typeOnly)) {
	            return res.getDrawable(R.drawable.ic_doc_video_am);
	        } return res.getDrawable(R.drawable.ic_doc_generic_am);
	    }
}